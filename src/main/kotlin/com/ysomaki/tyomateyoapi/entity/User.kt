package com.ysomaki.tyomateyoapi.entity

import jakarta.persistence.*

@Entity
@Table(name = "`user`")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    var id: Int,
    @Column(name = "Name")
    var name: String,
    @Column(name = "Password")
    var password: String,
)
