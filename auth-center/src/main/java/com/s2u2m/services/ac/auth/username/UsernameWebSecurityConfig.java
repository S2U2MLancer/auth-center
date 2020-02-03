package com.s2u2m.services.ac.auth.username;

import com.s2u2m.services.ac.AppContextProvider;
import com.s2u2m.services.ac.auth.AccountDetailsService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER - 10)
public class UsernameWebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.antMatcher("/login/username")
                .authorizeRequests()
                .antMatchers("/login/username").permitAll()
                .anyRequest().authenticated();
        http.httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//            super.configure(auth);
        AccountDetailsService detailsService = AppContextProvider.getContext().getBean(UsernameAccountDetailsService.class);
        auth.userDetailsService(detailsService);
    }
}
