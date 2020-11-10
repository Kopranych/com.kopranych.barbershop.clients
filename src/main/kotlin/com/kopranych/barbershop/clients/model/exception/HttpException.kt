package com.kopranych.barbershop.clients.model.exception

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.http.HttpStatus

abstract class HttpException internal constructor(
    @field:JsonProperty("http_status")
    @param:JsonProperty(value = "http_status", required = true) private val httpStatus: HttpStatus,
    @param:JsonProperty("message") override val message: String,
    @param:JsonProperty("detailed") private val detailed: String?
) : RuntimeException(message)