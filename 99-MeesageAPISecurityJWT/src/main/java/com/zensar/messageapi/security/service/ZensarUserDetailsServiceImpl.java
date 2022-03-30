package com.zensar.messageapi.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.zensar.messageapi.dao.ZensarUserDao;
import com.zensar.messageapi.entity.ZensarUser;
import com.zensar.messageapi.service.ZensarUserService;

@Service
public class ZensarUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private ZensarUserDao repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Talk to DB and fetch user details
		ZensarUser foundUser=repo.findByUsername(username);
		System.out.println(foundUser);
		if(foundUser==null) {
			throw new UsernameNotFoundException(username);
		}
		System.out.println("IN loadUserByUsername");
		//UserDetails is an interface given by spring security
		//we are free to implement interface but for simplicity spring security has given a class
		//to implements UserDetailsInterface
		//name of the class is User
		//in this method we need to create object of User and return it.
		//if(username.equals("zensar")) {
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		User authenticatedUser=new User(foundUser.getUsername(),
				foundUser.getPassword(),
				AuthorityUtils.createAuthorityList("ROLE_USER"));
		
		//this.service.addZensarUser(new ZensarUser("zensar",passwordEncoder.encode("zensar")));
		
		return authenticatedUser;
		//}
		//throw new UsernameNotFoundException(username);
	}

}
