package com.webapp.services;

import org.springframework.stereotype.Service;

import com.webapp.dtos.LoginDto;

@Service
public class LoginService {
	
	public String processLogin(LoginDto loginDto) {
		if(loginDto.getUsername().equals(loginDto.getPassword())) {
			loginDto.setStatus("Success");
		}else {
			loginDto.setStatus("Fail");
		}
		return "welcome";
	}

}
