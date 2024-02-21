package com.example.findmyip.repository
import com.example.findmyip.retrofit.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}