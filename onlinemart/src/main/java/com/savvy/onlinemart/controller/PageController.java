package com.savvy.onlinemart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// helper controller
@Controller
public class PageController {

	@RequestMapping (    value= {"/","/home","/index"}     )
	
	public ModelAndView index (){
	// ModelAndView is a spring class
	ModelAndView mv = new ModelAndView("page");
	
	mv.addObject("greeting","WELCOME to SPRING Web MVC");
	
	
	return mv;
	
}
}