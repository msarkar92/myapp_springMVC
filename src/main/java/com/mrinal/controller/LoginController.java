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

import com.mrinal.dao.UserLoginDAOImpl;
import com.mrinal.model.Login;

@Controller
@RequestMapping(value="/login")
public class LoginController {

	private final static Logger LOG = LoggerFactory.getLogger(SiteController.class);
	private final String page="project/login";

	@RequestMapping(method=RequestMethod.GET)
	public String show(Map<String, Object> model) throws Exception{
		//WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext();
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Login user=context.getBean("Login",Login.class);
		//User user=new User();
		model.put("Login", user);
		LOG.info("Forwarding to login...");
		return page;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("userForm") Login user,Map<String, Object> model) throws Exception{
		ModelAndView mav = null;
		System.out.println(user.getLoginValue());
		if(user!=null) {
			Boolean res=new UserLoginDAOImpl().validateLogin(user);
			mav = new ModelAndView("home");
			mav.addObject("NAME", res?user.getLoginValue():"No such user");
		}
		LOG.info("Forwarding to home...");
		return mav;
	}
	
	
	
}
