package com.mrinal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value= {"/","/home"})
public class SiteController {
	
	private final static Logger LOG = LoggerFactory.getLogger(SiteController.class);
	private Integer i=0;
	@RequestMapping(method=RequestMethod.GET)
	public String show(ModelMap model) throws Exception{
		LOG.info("Forwarding to home...");
		if(i==null)
			throw new NullPointerException();
		return "home";
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView nullPointerException(Exception e) {
		LOG.error("Exception Handled in conroller",e);
		ModelAndView mav = new ModelAndView("common/error/error");
		System.out.println(e.getClass().getSimpleName());
		mav.addObject("name", e.getClass().getSimpleName());
		mav.addObject("message", e.getMessage());
		return mav;
	}
}
