package com.DaiiChakib.spring_security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.DaiiChakib.spring_security.domain.Response;
import com.DaiiChakib.spring_security.model.User;
import com.DaiiChakib.spring_security.service.UserService;

@Controller
public class PreLoginController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value="/registration")
	public ResponseEntity<Response> registration(@RequestBody User user){
		User dbUser = userService.save(user);
		
		if(dbUser != null){
			return new ResponseEntity<Response>(new Response("User is saved successfully"),HttpStatus.OK);
		}
		return null;
	}
}
