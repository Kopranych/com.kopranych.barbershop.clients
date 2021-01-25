package com.kopranych.barbershop.clients.config

import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.ContextLoaderListener
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.filter.DelegatingFilterProxy
import javax.servlet.ServletContext

class SecurityInitializer : WebApplicationInitializer {
    override fun onStartup(sc: ServletContext) {
        val root = AnnotationConfigWebApplicationContext()
        root.register(WebSecurityConfig::class.java)
        sc.addListener(ContextLoaderListener(root))
        sc.addFilter("securityFilter", DelegatingFilterProxy("springSecurityFilterChain"))
            .addMappingForUrlPatterns(null, false, "/*")
    }
}