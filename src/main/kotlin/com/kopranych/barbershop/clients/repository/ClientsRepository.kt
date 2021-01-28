package com.kopranych.barbershop.clients.repository

import com.kopranych.barbershop.clients.model.dao.Client
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository

@Repository
interface ClientsRepository {
  fun findAll(pageable: Pageable) : Page<Client>
}