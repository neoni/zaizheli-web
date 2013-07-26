package net.zaizheli.web.mvc.controllers;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import net.zaizheli.constants.ApplicationConfig;
import net.zaizheli.domains.Activity;
import net.zaizheli.domains.Join;
import net.zaizheli.domains.User;
import net.zaizheli.repositories.ActivityRepository;
import net.zaizheli.repositories.JoinRepository;
import net.zaizheli.vo.PinUserVo;
import net.zaizheli.web.utils.SessionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/activity")
public class ViewActivityJoinersController {

	@Autowired
	ActivityRepository activityRepository;
	@Autowired 
	SessionUtil sessionUtil;
	@Autowired
	JoinRepository joinRepository;
	
	@RequestMapping(value="/{id}/joiners", method=RequestMethod.GET)
	public String view(@PathVariable String id, Model model, 
			HttpServletRequest request, HttpSession session){
		User user = sessionUtil.getSignInUser(session);
		if(user == null){
			return "redirect:/signin";
		}
		Activity activity=activityRepository.findOne(id);
		model.addAttribute("activity", activity);
		return "activity/joiners";
	}
	
	@RequestMapping(value="/{id}/joiners", method=RequestMethod.POST)
	public String viewPost(@PathVariable String id, Model model, 
			HttpServletRequest request, HttpSession session){
		return view(id, model, request, session);	
	}
	
	@RequestMapping(value="/{id}/getJoiners", method=RequestMethod.GET)
	public String get(@PathVariable String id, Model model, 
			HttpServletRequest request, HttpSession session){
		Pageable pageable = new PageRequest(0, 
				ApplicationConfig.masonryPageSize, 
				new Sort(new Order(Direction.ASC, "createdAt")));
		Collection<PinUserVo> pins = new ArrayList<PinUserVo>();
		Page<Join> joins = joinRepository.findByActivity(id, pageable);
		pageable = new PageRequest(0, 
				ApplicationConfig.masonryThumbPageSize, 
				new Sort(new Order(Direction.DESC, "updatedAt")));
		if(joins!=null){
			for(Join join : joins){
				Page<Activity> activities = activityRepository.findByCreatedBy(join.getJoiner().getId(), pageable);
				pins.add(PinUserVo.from(join.getJoiner(), activities.getContent()));
			}
		}
		model.addAttribute("pins", pins);
		return "profiles/people";
	}
	
}
