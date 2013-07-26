package net.zaizheli.web.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import net.zaizheli.domains.Activity;
import net.zaizheli.repositories.ActivityRepository;
import net.zaizheli.web.utils.SessionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/activities")
public class ViewSingleActivityController {

	@Autowired
	ActivityRepository activityRepository;
	@Autowired
	SessionUtil sessionUtil;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String view(@PathVariable String id, Model model, 
			HttpServletRequest request, HttpSession session){
		
		Activity activity = activityRepository.findOne(id);
		model.addAttribute("activity", activity);
		model.addAttribute("no", 1);
		return "activity/single";	
	}
	
	@RequestMapping(value="/{id}/{no}", method=RequestMethod.GET)
	public String viewP(@PathVariable String id, @PathVariable int no ,Model model, 
			HttpServletRequest request, HttpSession session){		
		Activity activity = activityRepository.findOne(id);
		model.addAttribute("activity", activity);
		model.addAttribute("no", no);
		return "activity/single";
	}
	
}
