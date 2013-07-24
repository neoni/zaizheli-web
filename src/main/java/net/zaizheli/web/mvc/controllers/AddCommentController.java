package net.zaizheli.web.mvc.controllers;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import net.zaizheli.constants.ActionType;
import net.zaizheli.constants.ApplicationConstants;
import net.zaizheli.domains.Action;
import net.zaizheli.domains.Activity;
import net.zaizheli.domains.Comment;
import net.zaizheli.domains.User;
import net.zaizheli.repositories.ActionRepository;
import net.zaizheli.repositories.ActivityRepository;
import net.zaizheli.repositories.CommentRepository;
import net.zaizheli.repositories.UserRepository;
import net.zaizheli.vo.CommentFormBean;
import net.zaizheli.web.utils.AjaxUtil;
import net.zaizheli.web.utils.SessionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/activity")
@SessionAttributes(ApplicationConstants.SESSION_SIGNIN_USER)
public class AddCommentController {
	
	@Autowired
	CommentRepository commentRepository;
	@Autowired
	ActionRepository actionRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	ActivityRepository activityRepository;
	@Autowired
	SessionUtil sessionUtil;
	@Autowired
	private AjaxUtil ajaxUtil;
	
	@ModelAttribute("cmtFormBean")
	public CommentFormBean creatFormBean() {
		CommentFormBean bean = new CommentFormBean();
		return bean;
	}

	@RequestMapping(value="/addcmt", method=RequestMethod.POST)
	public String add(@Valid CommentFormBean bean,
			BindingResult result,
			Model model, HttpServletRequest request, HttpSession session){	
		User signInUser=sessionUtil.getSignInUser(session);
		if(signInUser==null) {
			return "redirect:/signin";
		}
		Activity activity= activityRepository.findOne(bean.getActId());
		if(activity==null){
			throw new RuntimeException("Invalid activity id:" + bean.getActId());
		}
		// save comment
		Comment cmt = Comment.from(bean, signInUser);
		cmt.setActivity(activity);
		cmt.setFloor(activity.getCommentCount()+1);
		
		User user = userRepository.findOne(bean.getReplyToId());
		if(user!=null) {
			cmt.setReplyTo(user);
		}
		cmt = commentRepository.save(cmt);	
		// inc commented count of orignal activity
		activityRepository.inc(activity.getId(), "commentCount", 1);
		// incr comment count of sign in user
		userRepository.inc(signInUser.getId(), "commentCount", 1);		
		// save cmt activity
		Action action= new Action();
		action.setOwner(signInUser.getId());
		action.setCreatedAt(new Date());
		action.setTargetActivity(activity.getId());
		if (user != null) {
			action.setTargetUser(user.getId());
		}
		else {
			action.setTargetUser(activity.getCreatedBy().getId());
		}
		action.setContent(bean.getContent());
		action.setType(ActionType.COMMENT);
		action.setBy(sessionUtil.getBy(session));
		actionRepository.save(action);
		StringBuilder url = new StringBuilder();
		url.append("/activities/").append(activity.getId());
		return "redirect:" + url.toString();
	}
}
