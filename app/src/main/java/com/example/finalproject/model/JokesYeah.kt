package com.example.finalproject.model


import com.google.gson.annotations.SerializedName

class JokesYeah : ArrayList<JokesYeah.JokesYeahItem>(){
    data class JokesYeahItem(
        @SerializedName("id")
        val id: Int,
        @SerializedName("punchline")
        val punchline: String,
        @SerializedName("setup")
        val setup: String,
        @SerializedName("type")
        val type: String
    )
}