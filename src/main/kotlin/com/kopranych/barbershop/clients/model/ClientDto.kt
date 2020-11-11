package com.kopranych.barbershop.clients.model

import java.time.LocalDate

data class ClientDto(
    val id: Long,
    val name: String,
    val surname: String,
    val middleName: String,
    val phone: String,
    val email: String,
    val birthday: LocalDate,
    val fullName: String? = "$name $middleName $surname"
) {

}
