package com.kopranych.barbershop.clients.model.exception

import org.springframework.http.HttpStatus

class NotFoundException : HttpException {
  constructor(message: String, detailed: String) : super(HttpStatus.NOT_FOUND, message, detailed) {}
  constructor(message: String) : super(HttpStatus.NOT_FOUND, message, null) {}
}