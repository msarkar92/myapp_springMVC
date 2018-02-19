package com.mrinal.controller.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

	private final static Logger LOG = LoggerFactory.getLogger(ExceptionController.class);
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception e) {
		LOG.error("Exception thrown",e);
		ModelAndView mav = new ModelAndView("common/error/error");
		mav.addObject("name", e.getClass().getSimpleName());
		mav.addObject("message", e.getMessage());
		return mav;
	}
}