package net.zaizheli.web.mvc.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import net.zaizheli.constants.AjaxResultCode;
import net.zaizheli.domains.Place;
import net.zaizheli.domains.User;
import net.zaizheli.repositories.PlaceRepository;
import net.zaizheli.vo.AjaxResult;
import net.zaizheli.vo.BindingErrors;
import net.zaizheli.vo.PlaceCreationVo;
import net.zaizheli.web.utils.SessionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/places")
public class CreatePlaceController {
	
	@Autowired
	PlaceRepository placeRepository;
	@Autowired
	SessionUtil sessionUtil;
	
	@ModelAttribute("placeCreationVo")
	public PlaceCreationVo creatPlaceCreationVo() {
		PlaceCreationVo vo = new PlaceCreationVo();
		return vo;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody AjaxResult create(@Valid PlaceCreationVo vo, 
			BindingResult result, ModelAndView mav, HttpSession session){
		User signInUser = sessionUtil.getSignInUser(session);
		if(signInUser==null){
			return new AjaxResult(AjaxResultCode.NEED_SIGNIN);
		}
		if(result.hasErrors()){
			return new AjaxResult(AjaxResultCode.INVALID, 
					BindingErrors.from(result));
		}
		Place place = placeRepository.save(Place.from(vo, signInUser));
		return new AjaxResult(AjaxResultCode.SUCCESS, place);
	}
	
}
