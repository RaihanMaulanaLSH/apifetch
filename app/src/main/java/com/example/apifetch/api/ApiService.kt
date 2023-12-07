package com.example.apifetch.api

import com.example.apifetch.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.Callback


interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>



}