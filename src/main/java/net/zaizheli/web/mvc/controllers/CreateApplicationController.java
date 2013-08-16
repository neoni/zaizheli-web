package net.zaizheli.web.mvc.controllers;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import net.zaizheli.constants.ActionType;
import net.zaizheli.constants.AjaxResultCode;
import net.zaizheli.constants.ApplicationStatus;
import net.zaizheli.domains.Action;
import net.zaizheli.domains.Activity;
import net.zaizheli.domains.Application;
import net.zaizheli.domains.User;
import net.zaizheli.repositories.ActionRepository;
import net.zaizheli.repositories.ActivityRepository;
import net.zaizheli.repositories.ApplicationRepository;
import net.zaizheli.repositories.JoinRepository;
import net.zaizheli.repositories.UserRepository;
import net.zaizheli.vo.AjaxResult;
import net.zaizheli.vo.ApplicationVo;
import net.zaizheli.web.utils.SessionUtil;
import net.zaizheli.web.utils.TextUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/application")
public class CreateApplicationController {  

	@Autowired
	ActivityRepository activityRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	JoinRepository joinRepository;
	@Autowired
	SessionUtil sessionUtil;
	@Autowired
	ApplicationRepository applicationRepository;
	@Autowired
	ActionRepository actionRepository;
	@Autowired 
	TextUtil textUtil;
	
	@ModelAttribute("ApplicationVo")
	public ApplicationVo creatApplicationVo() {
		ApplicationVo vo = new ApplicationVo();
		return vo;
	}
	
	@RequestMapping(value="/{id}/create", method=RequestMethod.GET)
	public String create(@PathVariable String id, Model model, HttpSession session){
		if (sessionUtil.getSignInUser(session) == null) {
			return "redirect:/signin";
		}
		return "application/apply";
	}
		
	@RequestMapping(value="/{id}/create", method=RequestMethod.POST)
	public @ResponseBody AjaxResult create(@PathVariable String id, @Valid ApplicationVo vo, 
			BindingResult result, ModelAndView mav, HttpSession session) throws ParseException{
		User signInUser = sessionUtil.getSignInUser(session);
		//remove html
		vo.setAddress(textUtil.removeHtml(vo.getAddress()));
		vo.setRealName(textUtil.removeHtml(vo.getRealName()));
		vo.setSchool(textUtil.removeHtml(vo.getSchool()));
		Application app = Application.from(vo);
        app.setApplicant(signInUser);
        Activity activity = activityRepository.findOne(id);
        app.setActivity(activity);
        app.setStatus(ApplicationStatus.申请中);
        applicationRepository.save(app);
		activityRepository.inc(id, "applicationCount", 1);
		activityRepository.inc(id, "inJudgingCount", 1);
		Action action = new Action();
		action.setOwner(signInUser.getId());
		action.setTargetActivity(id);
		action.setCreatedAt(new Date());
		action.setType(ActionType.APPLY);
		action.setBy(sessionUtil.getBy(session));
		actionRepository.save(action);
		return new AjaxResult(AjaxResultCode.SUCCESS);
	}
}

