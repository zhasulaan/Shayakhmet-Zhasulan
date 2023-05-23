package com.example.finalproject.repository

import com.example.finalproject.model.JokesYeah
import retrofit2.http.GET

interface ApiService {
    @GET("random_ten")
    suspend fun getAllJoke(): JokesYeah
}