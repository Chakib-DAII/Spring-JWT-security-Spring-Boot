package com.DaiiChakib.spring_security.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Arrays;
import org.springframework.security.authentication.jaas.AuthorityGranter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.DaiiChakib.spring_security.model.User;

public class JwtUserFactory {

	public JwtUser create(User user) {
		// TODO Auto-generated method stub
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword() ,user,
				mapToGrantedAuthorities(new ArrayList<String>(Arrays.asList("Role_"+user.getRole())))
				, user.isEnabled());
	}

	private List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {
		
		return authorities.stream().map(Authority -> new SimpleGrantedAuthority(Authority)).collect(Collectors.toList());
	}

}
