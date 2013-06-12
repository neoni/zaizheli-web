package net.zaizheli.web.mvc.controllers;

import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import net.zaizheli.constants.ActionType;
import net.zaizheli.constants.AjaxResultCode;
import net.zaizheli.constants.ApplicationConfig;
import net.zaizheli.domains.Action;
import net.zaizheli.domains.Activity;
import net.zaizheli.domains.CityMeta;
import net.zaizheli.domains.Join;
import net.zaizheli.domains.Place;
import net.zaizheli.domains.Resource;
import net.zaizheli.domains.User;
import net.zaizheli.repositories.ActionRepository;
import net.zaizheli.repositories.ActivityRepository;
import net.zaizheli.repositories.CityMetaRepository;
import net.zaizheli.repositories.JoinRepository;
import net.zaizheli.repositories.PlaceRepository;
import net.zaizheli.repositories.ResourceRepository;
import net.zaizheli.repositories.UserRepository;
import net.zaizheli.services.ImageService;
import net.zaizheli.vo.ActivityCreationVo;
import net.zaizheli.vo.AjaxResult;
import net.zaizheli.vo.BindingErrors;
import net.zaizheli.vo.ImageReadyVo;
import net.zaizheli.vo.ValidationEngineError;
import net.zaizheli.web.utils.SessionUtil;
import net.zaizheli.web.utils.WebImageUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/activities")
public class CreateActivityController {
	
	
	@Autowired
	ActionRepository actionRepository;
	@Autowired
	CityMetaRepository cityMetaRepository;
	@Autowired
	PlaceRepository placeRepository;
	@Autowired
	ResourceRepository resourceRepository;
	@Autowired
	ActivityRepository activityRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	JoinRepository joinRepository;
	@Autowired
	ImageService imageService;
	@Autowired
	WebImageUtil webImageUtil;
	@Autowired
	SessionUtil sessionUtil;
	
	@ModelAttribute("activityCreationVo")
	public ActivityCreationVo creatActivityCreationVo() {
		ActivityCreationVo vo = new ActivityCreationVo();
		return vo;
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String create(Model model, HttpSession session){
		if (sessionUtil.getSignInUser(session) == null) {
			return "redirect:/signin";
		}
		return "activity/create";
	}
	
	@RequestMapping(value="create/validate", method=RequestMethod.POST)
	public @ResponseBody Object[] createValidate(@Valid ActivityCreationVo vo,
			BindingResult result, ModelAndView mav, HttpSession session) {
		String start=vo.getStartDate()+vo.getStartTime();
		String end=vo.getEndDate()+vo.getEndTime();
		if(start.compareTo(end)>0) {
			result.addError(new FieldError("vo", "endTime",
					"时间不对吧，再仔细想想吧~"));
		}
		if(vo.getImageUrl()==null || vo.getImageUrl().equalsIgnoreCase("http://placehold.it/300&text=Upload+Image")) {
			result.addError(new FieldError("vo", "err",
					"图片未上传哦~"));
		}
		if(vo.getEditor1()==null || vo.getEditor1().equals("")) {
			result.addError(new FieldError("vo", "err",
					"记得创建活动的讨论页面哦"));
		}
		if (result.hasErrors()) {
			result.addError(new FieldError("vo", "err",
					"信息有误，点击来看看吧~"));
			return ValidationEngineError.normalize(ValidationEngineError
					.from(result));
		} else {
			return new ValidationEngineError[] {};
		}
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public @ResponseBody AjaxResult create(@Valid ActivityCreationVo vo, 
			BindingResult result, ModelAndView mav, HttpSession session) throws ParseException{
		User signInUser = sessionUtil.getSignInUser(session);
		if(signInUser==null){
			return new AjaxResult(AjaxResultCode.NEED_SIGNIN);
		}
		
		if(result.hasErrors()){
			result.addError(new FieldError("vo", "err",
					"前面的信息有误，去看看吧~"));
			return new AjaxResult(AjaxResultCode.INVALID, 
					BindingErrors.from(result));
		}
		// save activity
		Activity activity=Activity.from(vo,signInUser);
		try {
			// get image
			ImageReadyVo ir = webImageUtil
					.prepareImageFromUrl(vo.getImageUrl());
			String resId = imageService.put(ir.getFile());
			Resource res = new Resource();
			res.setOrgSize(ir.getOrgSize());
			res.setResId(resId);
			res.setExt(ir.getExt());
			resourceRepository.save(res);
			activity.setImage(res);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
		if(StringUtils.hasText(vo.getPlaceId())){
			Place place = placeRepository.findOne(vo.getPlaceId());
			if(place!=null){
				CityMeta city = cityMetaRepository.getByName(place.getCity());
				if(city!=null){
					activity.setCity(city.getPinyin());
				}
				activity.setLngLat(place.getLngLat());
				activity.setPlace(place);
			}
		}else if(!StringUtils.hasText(activity.getCity())){
			activity.setCity(ApplicationConfig.defaultCityPinyin);
		}
		activity = activityRepository.save(activity);
		// increase activity count
		signInUser.setActivityCount(signInUser.getActivityCount()+1);
		signInUser.setActivityCreationCount(signInUser.getActivityCreationCount()+1);
		userRepository.save(signInUser);
		Join join= new Join();
		join.setActivity(activity);
		join.setJoiner(signInUser);
		join.setCreatedAt(activity.getCreatedAt());
		join.setStatus(1);
		joinRepository.save(join);
		// save action
		Action action = new Action();
		action.setOwner(signInUser.getId());
		action.setCreatedAt(new Date());
		action.setTargetActivity(activity.getId());
		action.setType(ActionType.ACTIVITY);
		action.setBy(sessionUtil.getBy(session));
		actionRepository.save(action);
		
		return new AjaxResult(AjaxResultCode.SUCCESS);
	}
}
