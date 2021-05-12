package com.sriyaan.recylerviewtest.NetworkControler

import com.sriyaan.recylerviewtest.modelresponse.Product_data
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {


    @GET("b/D11K")
    fun Load_Product() : Observable<List<Product_data>>

}