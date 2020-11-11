package com.kopranych.barbershop.clients.mapper

import com.kopranych.barbershop.clients.model.ClientDto
import com.kopranych.barbershop.clients.model.dao.Client
import org.mapstruct.Mapper

@Mapper
interface ClientMapper {
  fun map(client: Client): ClientDto
  fun map(clientDto: ClientDto): Client
}