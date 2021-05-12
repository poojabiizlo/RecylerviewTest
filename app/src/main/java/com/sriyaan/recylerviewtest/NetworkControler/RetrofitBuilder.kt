package com.sriyaan.recylerviewtest.NetworkControler

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    var gson = GsonBuilder()
        .setLenient()
        .create()
    fun getretrofit(): Retrofit{val retrofit=Retrofit.Builder() .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(gson)).baseUrl("https://jsonkeeper.com/").build()


        return retrofit

    }
    var apiService:ApiService= getretrofit().create(ApiService::class.java)
}