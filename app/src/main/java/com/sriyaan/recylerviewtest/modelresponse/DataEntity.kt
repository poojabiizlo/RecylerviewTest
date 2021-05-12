package com.sriyaan.recylerviewtest.modelresponse

import java.io.Serializable


data class Product_data(
    val title:String,
    val type: String,
    val description:String,
    val filename:String,
    val height: Int,
    val width:Int,
    val price:Double,
    val rating:Int)