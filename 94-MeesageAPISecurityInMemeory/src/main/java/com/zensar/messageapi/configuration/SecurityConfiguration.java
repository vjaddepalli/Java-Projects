package com.zensar.messageapi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	
	//Authentication - username, password
	//prove whatever user is claiming
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth
		.inMemoryAuthentication() //we are storing credentials in memory
		.withUser("zensar") //username
		.password("$2a$10$Yqc9EcfYIHKkQKxoF73ea.ooFyTPcdySzcD0soep8TXIkwJYgiWr") //passsword
		.roles("USER")
		.and()
		.passwordEncoder(getPasswordEncoder()); //role
		
		
	}

	//Authorization - specify access rights to resource
	//Access based on role
	//what are you allowed to do
	
	//http status code 403(forbidden) - specify user  authorized but not authenticated
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.csrf().disable()
			.authorizeHttpRequests()
			.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic(); // this asks user to enter for username & password using a prompt 
	}
	
	//following bean is set for password encoding
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		return passwordEncoder;
	}

}
