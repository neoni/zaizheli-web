package net.zaizheli.web.mvc.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.zaizheli.constants.ApplicationConfig;
import net.zaizheli.domains.Comment;
import net.zaizheli.repositories.ActivityRepository;
import net.zaizheli.repositories.CommentRepository;
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
public class ViewActivityComment {
	@Autowired
	ActivityRepository activityRepository;
	@Autowired 
	SessionUtil sessionUtil;
	@Autowired
	CommentRepository commentRepository;
	
	@RequestMapping(value="/{id}/comments", method=RequestMethod.GET)
	public String view(@PathVariable String id, Model model, 
			HttpServletRequest request, HttpSession session){
		Pageable pageable = new PageRequest(0, 
				ApplicationConfig.masonryPageSize, 
				new Sort(new Order(Direction.ASC, "floor")));
		Page<Comment> comments = commentRepository.findByActivity(id, pageable);
		model.addAttribute("comments", comments.getContent());
		return "activity/single_comment";
	}

}
