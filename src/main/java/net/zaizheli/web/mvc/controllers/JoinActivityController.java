package net.zaizheli.web.mvc.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.zaizheli.constants.AjaxResultCode;
import net.zaizheli.constants.ApplicationStatus;
import net.zaizheli.domains.Activity;
import net.zaizheli.domains.Application;
import net.zaizheli.domains.User;
import net.zaizheli.repositories.ActivityRepository;
import net.zaizheli.repositories.ApplicationRepository;
import net.zaizheli.repositories.JoinRepository;
import net.zaizheli.vo.AjaxResult;
import net.zaizheli.web.utils.SessionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/activity")
public class JoinActivityController {
	
	@Autowired
	ActivityRepository activityRepository;
	@Autowired 
	SessionUtil sessionUtil;
	@Autowired
	JoinRepository joinRepository;
	@Autowired
	ApplicationRepository applicationRepository;
		
	@RequestMapping(value="/{id}/join", method=RequestMethod.GET)
	public @ResponseBody AjaxResult view(@PathVariable String id, Model model, 
			HttpServletRequest request, HttpSession session){
		User user = sessionUtil.getSignInUser(session);
        Application app = applicationRepository.findByActivityAndapplicant(id, user.getId());
        if (app!=null) {
        	if(app.getStatus()==ApplicationStatus.申请中) {
        	     return new AjaxResult(AjaxResultCode.INVALID, "之前提交过了吧，申请正在等待活动创始人同意中哦 >o<");
        	}
        	if(app.getStatus()==ApplicationStatus.已加入) {
        		return new AjaxResult(AjaxResultCode.INVALID, "不用提交申请了，你已经是成员了哦 >o<");
        	}
        }
		Activity activity=activityRepository.findOne(id);
		if(activity.getApply()==1) {
			return new AjaxResult(AjaxResultCode.NEED_APP,id);
		}      
		Application application = new Application();
		application.setActivity(activity);
		application.setApplicant(user);
		application.setStatus(ApplicationStatus.申请中);
		application.setCreatedAt(new Date());
		application.setUpdatedAt(application.getCreatedAt());
		applicationRepository.save(application);
		return new AjaxResult(AjaxResultCode.SUCCESS);
	}
	

}
