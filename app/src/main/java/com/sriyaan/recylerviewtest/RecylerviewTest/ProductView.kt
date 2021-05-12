package com.sriyaan.recylerviewtest.RecylerviewTest

import com.sriyaan.recylerviewtest.RecylerviewTest.View.BaseView
import com.sriyaan.recylerviewtest.modelresponse.Product_data


interface ProductView {
    interface view: BaseView<presenter>
    {
        fun LoadData(data:List<Product_data>)
        fun hideloading()
        fun showloading()
        fun showMsg(msg: String)

    }

    interface presenter{
        fun Load_data()
    }
}