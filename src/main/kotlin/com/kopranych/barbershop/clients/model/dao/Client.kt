package com.kopranych.barbershop.clients.model.dao

import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Client(
    @Id
    val id: Long,
    @Column
    val name: String,
    @Column
    val surname: String,
    @Column
    val middleName: String,
    @Column
    val phone: String,
    @Column
    val email: String,
    @Column
    val birthday: LocalDate
) {
  @Column
  val fullName: String = "$name $middleName $surname"
}
