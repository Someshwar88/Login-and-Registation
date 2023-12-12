package com.example.login.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.login.model.User;
import com.example.login.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
