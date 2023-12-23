package com.ysomaki.tyomateyoapi.controller

import com.ysomaki.tyomateyoapi.entity.User
import com.ysomaki.tyomateyoapi.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class Controller(
    private val userRepository: UserRepository
) {
    @GetMapping("/{id}")
    fun findOneUser(@PathVariable id: Int): Optional<User> {
        println(userRepository.findById(id))
        return userRepository.findById(id)
    }
}
