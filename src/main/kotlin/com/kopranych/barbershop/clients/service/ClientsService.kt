package com.kopranych.barbershop.clients.service

import com.kopranych.barbershop.clients.model.dao.Client
import com.kopranych.barbershop.clients.model.exception.NotFoundException
import com.kopranych.barbershop.clients.repository.ClientsRepository
import org.springframework.stereotype.Service

@Service
class ClientsService(private val clientsRepository: ClientsRepository) {
  fun get(id: Long): Client {
    return clientsRepository.findById(id)
        .orElseThrow { NotFoundException("Not found client with id $id") }
  }

  fun getAll(): List<Client> {
    return clientsRepository.findAll().toList()
  }

  fun save(client: Client) {
    clientsRepository.save(client)
  }

  fun delete(id: Long) {
    clientsRepository.deleteById(id)
  }


}
