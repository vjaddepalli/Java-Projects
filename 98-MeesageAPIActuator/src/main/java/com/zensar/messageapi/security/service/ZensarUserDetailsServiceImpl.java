package com.zensar.messageapi.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.zensar.messageapi.entity.ZensarUser;
import com.zensar.messageapi.repository.ZensarUserRepository;

@Service
public class ZensarUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private ZensarUserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// To-do talk to DB aand fecth data
		
		ZensarUser foundUser=repo.findByUsername(username);
		System.out.println(foundUser);
		if(foundUser==null) {
			throw new UsernameNotFoundException(username);
		}
		
		// UserDetails Interface given by spring security
		// we are free to implement this interface but for simplicity spring security
		// implement userdetails interface
		// name of the class is User
		// in this method we need to create object of user and return it
		//if (username.equals("zensar")) {
			User authenticatedUser = new User(foundUser.getUsername(), foundUser.getPassword(),
					AuthorityUtils.createAuthorityList("ROLE_USER"));
			System.out.println("In loadUserByUsername");
			return authenticatedUser;
		//}

		//throw new UsernameNotFoundException(username);

	}

}
