package com.kopranych.barbershop.clients.controller

import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/api/\${spring.application.name}")
abstract class BaseController {
}