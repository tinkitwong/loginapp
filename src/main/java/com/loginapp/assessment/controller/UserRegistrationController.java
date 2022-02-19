package com.loginapp.assessment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loginapp.assessment.dto.UserRegistrationDto;
import com.loginapp.assessment.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	/* register.html ${user} gets user object here */
	@ModelAttribute("user")
	public UserRegistrationDto userRegister() {
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String showRegisterForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return  "redirect:/registration?success";
	}
}
