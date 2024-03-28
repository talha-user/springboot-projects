package com.cts.springwebbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"","/"})
public class DefaultController {

//	@RequestMapping(method=RequestMethod.GET)
//	public String homePageAction() {
//		return "home-page";
//	}
	
	@GetMapping
	public ModelAndView homePageAction(@RequestParam(name="unm",required=false) String username) {
		String greeting = username!=null?"Hello "+username:"Hello Somebody";
        return new ModelAndView("home-page","message",greeting);
	
}
}
