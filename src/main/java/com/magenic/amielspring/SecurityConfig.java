package com.magenic.amielspring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 
 */
@Configuration
@Profile("development")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * This method disables the security.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll().and().httpBasic().disable().csrf().disable();
    }
}