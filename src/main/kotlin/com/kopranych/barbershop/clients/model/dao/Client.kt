package com.kopranych.barbershop.clients.model.dao

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "clients")
data class Client(
    @Id
    val id: Long,
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
    val birthday: LocalDate
) {
  @Column
  val fullName: String = "$name $middleName $surname"
}
