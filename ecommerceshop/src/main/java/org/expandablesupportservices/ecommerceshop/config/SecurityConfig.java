package org.expandablesupportservices.ecommerceshop.config;

import javax.sql.DataSource;

import org.expandablesupportservices.ecommerceshop.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
public class SecurityConfig {


	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		
		
		UserDetails kamran= User.builder()
				.username("kamran")
				.password("{noop}test123")
				.roles("CUSTOMER")
				.build();
		
		UserDetails ali= User.builder()
				.username("ali")
				.password("{noop}test123")
				.roles("CUSTOMER","MANAGER")
				.build();
		
		UserDetails john= User.builder()
				.username("john")
				.password("{noop}test123")
				.roles("CUSTOMER","MANAGER","ADMIN")
				.build();
		
		
		return new InMemoryUserDetailsManager(kamran,ali,john);
		
	}
	
	
	
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception 
	{
		
	httpSecurity.authorizeHttpRequests(configure ->
	configure
	.requestMatchers(HttpMethod.GET, "/").hasAnyRole("CUSTOMER","MANAGER","ADMIN")	
	.requestMatchers(HttpMethod.GET, "/api/customer").hasRole("CUSTOMER")	
	.requestMatchers(HttpMethod.GET, "/api/customer/**").hasRole("CUSTOMER")	
	.requestMatchers(HttpMethod.POST, "/api/customer").hasRole("MANAGER")	
	.requestMatchers(HttpMethod.PUT, "/api/customer").hasRole("MANAGER")	
	.requestMatchers(HttpMethod.DELETE, "/api/customer/**").hasRole("ADMIN")
	.requestMatchers(HttpMethod.GET ,"/api/user/create").permitAll()
	.anyRequest().authenticated()
		
			);
	
	httpSecurity.httpBasic(Customizer.withDefaults());
	
	httpSecurity.csrf(csrf->csrf.disable());
	
	return httpSecurity.build();
		
	
		
	}
	
	
}
