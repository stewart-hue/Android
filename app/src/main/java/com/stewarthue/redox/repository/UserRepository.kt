package com.stewarthue.redox.repository


import com.stewarthue.redox.data.UserDao
import com.stewarthue.redox.model.User


class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(user: User) {
        userDao.registerUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.loginUser(email, password)
    }
}