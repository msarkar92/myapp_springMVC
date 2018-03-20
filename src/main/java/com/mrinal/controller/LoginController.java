package com.mrinal.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mrinal.model.User;

@Controller
@RequestMapping(value="/login")
public class LoginController {

	private final static Logger LOG = LoggerFactory.getLogger(SiteController.class);
	private final String page="project/login";

	@RequestMapping(method=RequestMethod.GET)
	public String show(Map<String, Object> model) throws Exception{
		//WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		User user=context.getBean("User",User.class);
		//User user=new User();
		model.put("User", user);
		LOG.info("Forwarding to login...");
		return page;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("userForm") User user,Map<String, Object> model) throws Exception{
		ModelAndView mav = null;
		System.out.println(user.getName());
		if(user!=null) {
			mav = new ModelAndView("home");
			mav.addObject("NAME", user.getName());
		}
		LOG.info("Forwarding to home...");
		return mav;
	}
	
	
	
}
