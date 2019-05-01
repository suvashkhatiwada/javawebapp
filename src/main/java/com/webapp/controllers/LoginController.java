package com.webapp.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webapp.dtos.LoginDto;
import com.webapp.dtos.SignupDto;
import com.webapp.services.LoginService;

@Controller
public class LoginController {
	
	private LoginService loginService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		LoginDto ldto = new LoginDto();
		mv.addObject("loginObject", ldto);
		return mv;
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView loginProcess(LoginDto loginDto) throws Exception {
		System.out.println(loginDto.toString());
		String status = loginService.processLogin(loginDto);
		ModelAndView mav = new ModelAndView(status);
		mav.addObject("loginObject", loginDto);
		return mav;
		
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}