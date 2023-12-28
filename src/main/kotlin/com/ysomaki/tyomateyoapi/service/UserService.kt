package com.ysomaki.tyomateyoapi.service

import com.ysomaki.tyomateyoapi.entity.User
import com.ysomaki.tyomateyoapi.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun findOneUserById(id: Int): Optional<User> {
        return userRepository.findById(id)
    }
}
