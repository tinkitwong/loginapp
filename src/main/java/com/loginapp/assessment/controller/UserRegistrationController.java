package com.loginapp.assessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loginapp.assessment.dto.UserRegistrationDto;
import com.loginapp.assessment.service.UserService;

@Controller
@RequestMapping("/register")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return  "redirect:/register?sucess";
	}
}
