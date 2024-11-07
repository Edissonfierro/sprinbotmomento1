package com.example.facturassapi.controller


import com.example.facturassapi.model.Cliente
import com.example.facturassapi.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/client")


class ClientController {

    @Autowired
    lateinit var clientService: ClientService
    @GetMapping
    fun list(): List<Cliente> {
        return clientService.list()
}

    @PostMapping
    fun save (@RequestBody client:Cliente):Cliente {
       return clientService.save(client)

    }

}