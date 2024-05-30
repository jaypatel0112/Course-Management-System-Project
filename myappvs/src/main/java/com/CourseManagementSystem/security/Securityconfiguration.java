/*
 * package com.CourseManagementSystem.security;
 * 
 * import org.springframework.context.annotation.Bean;
 * import org.springframework.context.annotation.Configuration;
 * import org.springframework.security.authentication.AuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity;
 * import org.springframework.security.config.http.SessionCreationPolicy;
 * import org.springframework.security.core.context.SecurityContextHolder;
 * import org.springframework.security.web.SecurityFilterChain;
 * import org.springframework.security.web.authentication.
 * UsernamePasswordAuthenticationFilter;
 * import org.springframework.security.web.authentication.logout.LogoutHandler;
 * 
 * import lombok.RequiredArgsConstructor;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity
 * 
 * @RequiredArgsConstructor // creates constructor of all final variables
 * public class Securityconfiguration {
 * 
 * @Bean
 * public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
 * Exception {
 * 
 * http
 * .csrf(csrf -> csrf
 * .disable())
 * .cors(withDefaults())
 * .authorizeHttpRequests(requests ->
 * requests.requestMatchers("/login/**","/signup/**")
 * .permitAll()
 * .anyRequest()
 * .authenticated())
 * .sessionManagement(management -> management
 * .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
 * .logout()
 * .logoutUrl("/logout")
 * .addLogoutHandler(logoutHandler)
 * .logoutSuccessHandler((request, response, authentication) ->
 * SecurityContextHolder.clearContext()
 * );
 * 
 * return http.build();
 * }
 */