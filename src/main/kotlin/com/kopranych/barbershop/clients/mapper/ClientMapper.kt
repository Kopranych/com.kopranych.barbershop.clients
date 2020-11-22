package com.kopranych.barbershop.clients.mapper

import com.kopranych.barbershop.clients.model.dao.Client
import com.kopranych.barbershop.clients.model.dto.ClientDto
import org.mapstruct.Mapper

@Mapper
interface ClientMapper {
  fun map(client: Client): ClientDto
  fun map(clientDto: ClientDto): Client
}