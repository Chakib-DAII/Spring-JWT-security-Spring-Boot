package com.DaiiChakib.spring_security.service;

import java.util.List;

import com.DaiiChakib.spring_security.model.User;

public interface UserService {

	User save(User user);

	List<User> findAll();

	User getUserByEmail(String email);

}
