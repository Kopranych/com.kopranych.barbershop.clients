package com.kopranych.barbershop.clients.controller

import com.kopranych.barbershop.clients.model.dao.Client
import com.kopranych.barbershop.clients.service.ClientsService
import org.springframework.web.bind.annotation.*

@RestController
class ClientsController(private val clientsService: ClientsService) : BaseController() {

  @GetMapping("/{id}")
  fun get(@PathVariable id: Long) : Client {
    return clientsService.get(id)
  }

  @GetMapping
  fun get() : List<Client> {
    return clientsService.getAll()
  }

  @PostMapping
  fun save(@RequestBody client: Client) {
    clientsService.save(client)
  }

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) {
    clientsService.delete(id)
  }
}