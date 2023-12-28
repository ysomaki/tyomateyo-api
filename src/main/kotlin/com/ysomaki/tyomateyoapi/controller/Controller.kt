package com.ysomaki.tyomateyoapi.controller

import com.ysomaki.tyomateyoapi.entity.User
import com.ysomaki.tyomateyoapi.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class Controller(
    private val userService: UserService
) {
    @GetMapping("/accounts/{id}")
    fun findOneUser(@PathVariable id: Int): Optional<User> {
        println(userService.findOneUserById(id))
        return userService.findOneUserById(id)
    }
}
