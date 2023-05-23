package com.example.finalproject.retrofit


import com.example.finalproject.repository.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://official-joke-api.appspot.com/"

    val retrofitCall = getClient().create(ApiService::class.java)

    fun getClient(): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }
}