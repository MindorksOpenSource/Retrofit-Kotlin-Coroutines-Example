package com.mindorks.retrofit.coroutines.data.repository

import com.mindorks.retrofit.coroutines.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}