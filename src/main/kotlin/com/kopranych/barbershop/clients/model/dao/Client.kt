package com.kopranych.barbershop.clients.model.dao

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "clients")
data class Client(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,
    @Column(name = "name")
    val name: String,
    @Column(name = "surname")
    val surname: String,
    @Column(name = "middle_name")
    val middleName: String,
    @Column(name = "phone")
    val phone: String,
    @Column(name = "email")
    val email: String,
    @Column(name = "birthday")
    val birthday: LocalDate,
    @Column(name = "full_name")
    val fullName: String = "$name $middleName $surname"
) {
}
