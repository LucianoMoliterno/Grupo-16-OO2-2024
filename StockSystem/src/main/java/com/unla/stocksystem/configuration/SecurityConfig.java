package com.unla.stocksystem.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.requestMatchers("/", "/home", "/record")
				.permitAll().requestMatchers("/admin/**").hasRole("ADMIN").requestMatchers("/user/**").hasRole("USER")
				.anyRequest().authenticated()).formLogin(formLogin -> formLogin.loginPage("/login").permitAll())
				.logout(logout -> logout.permitAll()).csrf(Customizer.withDefaults());

		return http.build();
	}

}