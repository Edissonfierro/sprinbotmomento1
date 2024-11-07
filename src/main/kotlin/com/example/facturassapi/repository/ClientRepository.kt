package com.example.facturassapi.repository


import com.example.facturassapi.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ClientRepository:JpaRepository<Cliente, Long> {
}