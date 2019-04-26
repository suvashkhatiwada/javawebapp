package com.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignupController {
	
	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String signup() {
		System.out.println("Signup Here");
		return "signup";
	}

}
