package com.ysomaki.tyomateyoapi.controller

import com.ysomaki.tyomateyoapi.entity.User
import com.ysomaki.tyomateyoapi.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.*

@Controller
class Controller {
    @Autowired
    lateinit var userRepository: UserRepository

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Int): Optional<User> {
        return userRepository.findById(id)
    }
}
