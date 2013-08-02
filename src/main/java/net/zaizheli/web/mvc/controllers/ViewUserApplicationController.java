package net.zaizheli.web.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.zaizheli.domains.Application;
import net.zaizheli.domains.User;
import net.zaizheli.repositories.ActivityRepository;
import net.zaizheli.repositories.ApplicationRepository;
import net.zaizheli.web.utils.SessionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/application")
public class ViewUserApplicationController {
	
	@Autowired
	ActivityRepository activityRepository;
	@Autowired 
	SessionUtil sessionUtil;
	@Autowired
	ApplicationRepository applicationRepository;
	
	@RequestMapping(value="/{id}/view", method=RequestMethod.GET)
	public String view(@PathVariable String id, 
			@PathVariable String view, Model model, 
			HttpServletRequest request, HttpSession session){
		User signInuser=sessionUtil.getSignInUser(session);
		if(signInuser==null) {
			return "redirect:/signin";
		}
		Application application = applicationRepository.findOne(id);
		model.addAttribute("application", application);
		return "application/application";
	}
	
}
