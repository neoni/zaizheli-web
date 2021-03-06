package net.zaizheli.web.mvc.controllers;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import net.zaizheli.vo.FilterElementVo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MapViewController {
	
	
	@RequestMapping(value = "/map", method = RequestMethod.GET)	
	private String toMap( Model model, 
			HttpServletRequest request) {
		String city = request.getParameter("city");
		String startTime = request.getParameter("startTime");
		String endTime = request.getParameter("endTime");
		String category = request.getParameter("category");
		String keyword = request.getParameter("keyword");
		Collection<FilterElementVo> filters = new ArrayList<FilterElementVo>();
		StringBuilder sb = new StringBuilder();
		FilterElementVo filter = null;
		
		// set city filter
		filter = new FilterElementVo();
		filter.setType("city");
		filter.setTypeLabel("在哪里");
		filter.setValue("");
		filter.setLabel("无所谓");
		if (StringUtils.hasText(city)) {
			filter.setLabel(city);
			filter.setValue(city);
		}
		filters.add(filter);
		sb.append("city=").append(filter.getValue()).append("&");
		
		// set category filter
		filter = new FilterElementVo();
		filter.setType("category");
		filter.setTypeLabel("分类");
		filter.setValue("");
		filter.setLabel("全部");
		if(StringUtils.hasText(category)){
			filter.setLabel(category);
			filter.setValue(category);
		}
		filters.add(filter);
		sb.append("category=").append(filter.getValue()).append("&");
		
		//set startTime filter
		filter = new FilterElementVo();
		filter.setType("startTime");
		filter.setTypeLabel("起始时间");
		filter.setValue("");
		filter.setLabel("");
		if (StringUtils.hasText(startTime)) {
			filter.setLabel(startTime);
			filter.setValue(startTime);
		}
		filters.add(filter);
		sb.append("startTime=").append(filter.getValue()).append("&");
		
		//set endTime filter
		filter = new FilterElementVo();
		filter.setType("endTime");
		filter.setTypeLabel("终止时间");
		filter.setValue("");
		filter.setLabel("");
		if (StringUtils.hasText(endTime)) {
			filter.setLabel(endTime);
			filter.setValue(endTime);
		}
		filters.add(filter);
		sb.append("endTime=").append(filter.getValue()).append("&");
		
		// set keyword filter
		filter = new FilterElementVo();
		filter.setType("keyword");
		filter.setTypeLabel("关键词");
		filter.setValue("");
		filter.setLabel("未选择");
		if(StringUtils.hasText(keyword)){
			filter.setLabel(keyword);
			filter.setValue(keyword);
		}
		filters.add(filter);
		sb.append("keyword=").append(filter.getValue()).append("&");
		
		model.addAttribute("filters", filters);
		model.addAttribute("qStr", sb.toString());
		return "map";
	}
}
