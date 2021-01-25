package com.kopranych.barbershop.clients.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder


@Configuration
@EnableWebSecurity
class WebSecurityConfig : WebSecurityConfigurerAdapter() {
    @Bean
    @Throws(Exception::class)
    override fun authenticationManagerBean(): AuthenticationManager {
        return super.authenticationManagerBean()
    }

    @Bean
    @Throws(Exception::class)
    override fun userDetailsServiceBean(): UserDetailsService {
        return super.userDetailsServiceBean()
    }

    @Throws(Exception::class)
    override fun configure(
        auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication()
            .withUser("bestbarber")
            .password(passwordEncoder()?.encode("password"))
            .roles("USER")
    }

//    @Throws(Exception::class)
//    override fun configure(
//        http: HttpSecurity) {
//        http
//            .authorizeRequests()
////            .antMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .httpBasic()
//    }

    @Bean
    fun passwordEncoder(): PasswordEncoder? {
        return BCryptPasswordEncoder()
    }
//
//    @Bean
//    fun customOpenAPI(): OpenAPI? {
//        return OpenAPI()
//            .components(Components()
//                .addSecuritySchemes("bearer-key",
//                    SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")))
//    }

}