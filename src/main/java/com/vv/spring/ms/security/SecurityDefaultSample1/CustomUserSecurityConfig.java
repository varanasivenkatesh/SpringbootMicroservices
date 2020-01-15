package com.vv.spring.ms.security.SecurityDefaultSample1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.parameters.DefaultSecurityParameterNameDiscoverer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.List;

@EnableWebSecurity
@Configuration
public class CustomUserSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public UserDetailsService userDetailsService()
    {
        List<UserDetails> user = new ArrayList<>();
        user.add(User.withDefaultPasswordEncoder().username("varanasi").password("123").roles("USER").build());
        return new InMemoryUserDetailsManager(user);

    }
}
