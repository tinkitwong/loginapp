package com.loginapp.assessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.loginapp.assessment.dto.UserRegistrationDto;

@Controller
public class MainController {
	
	/* ${user} gets user object here */
	@ModelAttribute("user")
	public UserRegistrationDto getUser() {
		return new UserRegistrationDto();
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
}
