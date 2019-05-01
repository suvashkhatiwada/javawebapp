package com.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.dtos.SignupDto;

@Controller
public class SignupController {
	
	
	
	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public ModelAndView signup() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup");
		SignupDto dto = new SignupDto();
		mv.addObject("signupObject", dto);
		return mv;
	}
	
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public ModelAndView  signupProcess(SignupDto signupDto) throws Exception {
		System.out.println(signupDto.toString());
		ModelAndView mav = new ModelAndView("welcome");
		mav.addObject("signupObject", signupDto);
		return mav;
	}

}
