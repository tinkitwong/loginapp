package com.loginapp.assessment.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginapp.assessment.dto.UserRegistrationDto;
import com.loginapp.assessment.model.Role;
import com.loginapp.assessment.model.User;
import com.loginapp.assessment.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;	 
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public User save(UserRegistrationDto registrationDto) {
		
		User user = new User(registrationDto.getFirstName(),
				registrationDto.getLastName(),
				registrationDto.getEmail(),
				registrationDto.getPassword(),
				Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}
	
}
