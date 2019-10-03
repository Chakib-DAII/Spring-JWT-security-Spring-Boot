package com.DaiiChakib.spring_security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.DaiiChakib.spring_security.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

	User findByEmailIgnoreCase(String username);

	
	
}
