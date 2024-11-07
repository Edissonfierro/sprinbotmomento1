package com.example.facturassapi.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity

@Table(name = "cliente")
class Cliente {
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Id
@Column(updatable = false)
var id: Long? = null
var nui: String? = null
var fullname: String? = null
var addres: Long? = null

}