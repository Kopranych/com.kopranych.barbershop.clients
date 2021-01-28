package com.kopranych.barbershop.clients.service

import com.kopranych.barbershop.clients.model.dao.Client
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service
class ClientsService() {
//  fun get(id: Long): Client {
//    return clientsRepository.findById(id)
//        .orElseThrow { NotFoundException("Not found client with id $id") }
//  }

  fun getAll(pageable: Pageable): Page<Client>? {
//    randomSleep()
//    return clientsRepository.findAll(pageable)
    return null
  }

  fun save(client: Client) {
//    clientsRepository.save(client)
  }

  fun delete(id: Long) {
//    clientsRepository.deleteById(id)
  }

  private fun randomSleep() {
    val random = Random()
    val randomNum: Int = random.nextInt(3 - 1 + 1) + 1
    if (randomNum == 3) sleep()
  }

  private fun sleep(){
    Thread.sleep(10000)
  }


}
