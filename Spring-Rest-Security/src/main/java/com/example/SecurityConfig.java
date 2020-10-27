package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub.
		auth
		.inMemoryAuthentication()
		.withUser("raju")
		.password(PasswordEncoder().encode("raju123"))
		.roles("USER")
		.and()
		.withUser("admin")
		.password(PasswordEncoder().encode("admin12300"))
		.roles("USER","ADMIN");
		
		
	}
   @Bean
	public PasswordEncoder PasswordEncoder() {
		
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/","/user/**").hasAnyRole("USER","ADMIN")
		.and()
		.formLogin();
		
	}
	

}
