package com.ysomaki.tyomateyoapi.repository

import com.ysomaki.tyomateyoapi.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, Int> {
}
