package com.example.finalproject.repository

import com.example.finalproject.model.JokesYeah

class JokesReposImpl(val apiService: ApiService): ApiService {
    override suspend fun getAllJoke(): JokesYeah {
        return apiService.getAllJoke()
    }

}