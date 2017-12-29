package com.riddhik.oli.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Value("${spring.datasource.driver-class-name}")
    private String oauthClass;

    @Value("${spring.datasource.url}")
    private String oauthUrl;
    
    @Value("${spring.datasource.username}")
    private String jdbcuserName;
    
    @Value("${spring.datasource.password}")
    private String jdbcPassword;
    
    private BCryptPasswordEncoder passwordEncoder;

    @Bean
    public TokenStore tokenStore() {
        DataSource tokenDataSource = DataSourceBuilder.create()
                        .driverClassName(oauthClass)
                        .username(jdbcuserName)
                        .password(jdbcPassword)
                        .url(oauthUrl)
                        .build();
        return new JdbcTokenStore(tokenDataSource);
    }

	@Override
	public void configure(AuthorizationServerSecurityConfigurer authServer) throws Exception {
		authServer.checkTokenAccess("isAuthenticated()");
		authServer.passwordEncoder(passwordEncoder);
	}

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("interview").secret("secret")
				.authorizedGrantTypes("authorization_code", "refresh_token", "password")
				.scopes("read", "write", "trust").accessTokenValiditySeconds(50).resourceIds("oauth2-resource");
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer authServerEndPoint) {
		authServerEndPoint.authenticationManager(authenticationManager).userDetailsService(userDetailsService);
		authServerEndPoint.tokenStore(tokenStore());
		
	}

}
