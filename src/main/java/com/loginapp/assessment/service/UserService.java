package com.loginapp.assessment.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.loginapp.assessment.dto.UserRegistrationDto;
import com.loginapp.assessment.model.User;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);
	
}
