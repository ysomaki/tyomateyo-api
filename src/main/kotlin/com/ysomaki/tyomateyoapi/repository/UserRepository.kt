package com.ysomaki.tyomateyoapi.repository

import com.ysomaki.tyomateyoapi.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>
