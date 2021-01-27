package com.kopranych.barbershop.clients.controller

import com.kopranych.barbershop.clients.mapper.ClientMapper
import com.kopranych.barbershop.clients.model.dto.ClientDto
import com.kopranych.barbershop.clients.service.ClientsService
import org.mapstruct.factory.Mappers
import org.springframework.web.bind.annotation.*

@RestController
class ClientsController(private val clientsService: ClientsService) : BaseController() {

  val mapper: ClientMapper = Mappers.getMapper(ClientMapper::class.java)

  @GetMapping("/{id}")
  fun get(@PathVariable id: String): String {
    return "Hello aws $id!";
//    return mapper.map(clientsService.get(id))
  }

  @GetMapping
  fun getHello(): String {
    return "Hello aws!";
//    return mapper.map(clientsService.get(id))
  }

//  @GetMapping
//  fun get(@RequestParam(defaultValue = "0") page: Int, @RequestParam(defaultValue = "100") size: Int): Page<ClientDto> {
//    return clientsService.getAll(PageRequest.of(page, size)).map(mapper::map)
//  }

  @PostMapping
  fun save(@RequestBody client: ClientDto) {
    clientsService.save(mapper.map(client))
  }

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: Long) {
    clientsService.delete(id)
  }
}