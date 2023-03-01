package com.team.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new MessageDigestPasswordEncoder("SHA-512");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/web/app/**").authenticated()
                .and()
                .formLogin().loginPage("/web/login/login-page")
                .loginProcessingUrl("/authenticateUser")
                .defaultSuccessUrl("/web/app/dashboard")
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/web/login/login-page?logout")
                .permitAll();
    }
}

