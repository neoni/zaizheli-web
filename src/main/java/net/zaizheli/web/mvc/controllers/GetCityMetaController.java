package net.zaizheli.web.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import net.zaizheli.constants.AjaxResultCode;
import net.zaizheli.constants.ApplicationConfig;
import net.zaizheli.domains.CityMeta;
import net.zaizheli.exceptions.ResourceNotFoundException;
import net.zaizheli.repositories.CityMetaRepository;
import net.zaizheli.vo.AjaxResult;
import net.zaizheli.web.utils.AjaxUtil;
import net.zaizheli.web.utils.SessionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GetCityMetaController {

	@Autowired
	CityMetaRepository cityMetaRepository;
	@Autowired
	AjaxUtil ajaxUtil;
	@Autowired
	SessionUtil sessionUtil;

	@RequestMapping(value="/citymeta", method=RequestMethod.GET)
	public @ResponseBody AjaxResult meta(HttpServletRequest request,
			ModelAndView mav, HttpSession session){
		if(!ajaxUtil.isAjaxRequest(request)){
			throw new ResourceNotFoundException();
		}
		CityMeta city = sessionUtil.getGeoCityMeta(session);
		return city != null ? new AjaxResult(AjaxResultCode.SUCCESS, city) :
			meta(null, request, mav, session);
	}

	@RequestMapping(value="/citymeta/{pinyin}", method=RequestMethod.GET)
	public @ResponseBody AjaxResult meta(@PathVariable String pinyin,
			HttpServletRequest request, ModelAndView mav, HttpSession session){
		if(!ajaxUtil.isAjaxRequest(request)){
			throw new ResourceNotFoundException();
		}
		String py = pinyin;
		if(!StringUtils.hasText(pinyin)){
			py = ApplicationConfig.defaultCityPinyin;
		}
		CityMeta cityMeta = cityMetaRepository.getByPinyin(py);
		if(cityMeta == null){
			cityMeta = cityMetaRepository
					.getByPinyin(ApplicationConfig.defaultCityPinyin);
		}
		if(cityMeta != null && cityMeta.getPinyin().equals(ApplicationConfig.defaultCityPinyin) &&
		  (cityMeta.getLngLat()==null || cityMeta.getLngLat().length==0)){
		   Double[] lngLat = new Double[]{120.17189024999996,30.261621415769714};
		   cityMeta.setLngLat(lngLat);
		}
		return new AjaxResult(AjaxResultCode.SUCCESS, cityMeta);
	}

}
