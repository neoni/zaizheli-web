package net.zaizheli.web.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import net.zaizheli.domains.User;
import net.zaizheli.web.utils.SessionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {
	
	@Autowired
	private SessionUtil sessionUtil;	
	
	@RequestMapping(value="/message/cmt", method=RequestMethod.GET)
	public String cmt(Model model, 
			HttpServletRequest request, HttpSession session){
		User user = sessionUtil.getSignInUser(session);
		if(user == null){
			return "redirect:/signin";
		}
		model.addAttribute("user", user);
		return "message/cmt";
		
	}
	
	@RequestMapping(value="/message/pm", method=RequestMethod.GET)
	public String pm(Model model, 
			HttpServletRequest request, HttpSession session){
		User user = sessionUtil.getSignInUser(session);
		if(user == null){
			return "redirect:/signin";
		}
		model.addAttribute("user", user);
		return "message/pm";
	}
	
	@RequestMapping(value="/message/inform", method=RequestMethod.GET)
	public String inform(Model model, 
			HttpServletRequest request, HttpSession session){
		User user = sessionUtil.getSignInUser(session);
		if(user == null){
			return "redirect:/signin";
		}
		model.addAttribute("user", user);
		return "message/inform";
	}
	
	@RequestMapping(value="/message/atme", method=RequestMethod.GET)
	public String atme(Model model, 
			HttpServletRequest request, HttpSession session){
		User user = sessionUtil.getSignInUser(session);
		if(user == null){
			return "redirect:/signin";
		}
		model.addAttribute("user", user);
		return "message/atme";
	}

}
