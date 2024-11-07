package com.example.facturassapi.service

import com.example.facturassapi.model.Cliente
import com.example.facturassapi.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class ClientService {

    @Autowired
    lateinit var clientRepository: ClientRepository
    fun list(): List<Cliente> {
        return clientRepository.findAll()
    }
    fun save (client: Cliente):Cliente {
        return clientRepository.save(client)

    }
}