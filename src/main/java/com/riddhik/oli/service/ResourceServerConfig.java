package com.riddhik.oli.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	protected void configure(HttpSecurity httpRequest) throws Exception {
		httpRequest.requestMatchers().antMatchers("/login").and().authorizeRequests().anyRequest().authenticated().and()
				.formLogin().permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
		authManagerBuilder.inMemoryAuthentication().withUser("riddhik").password("riddhik").roles("ADMIN");
	}

}
