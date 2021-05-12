package com.sriyaan.recylerviewtest.RecylerviewTest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar

import android.widget.Toast
import androidx.databinding.DataBindingUtil

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


import com.sriyaan.recylerviewtest.R
import com.sriyaan.recylerviewtest.databinding.ActivityProductListBinding
import com.sriyaan.recylerviewtest.modelresponse.Product_data
import com.sriyaan.recylerviewtest.myadapter.ProductListAdapter


class ProductListActivity : AppCompatActivity(),ProductView.view {


    override fun LoadData(data: List<Product_data>) {
        if(data.size!=0)
        {
            val adapter = ProductListAdapter(data)
            binding?.productdapter=adapter
        }
    }

    override fun showloading() {

        progressbar.visibility=View.VISIBLE

    }



    override fun hideloading() {
        progressbar.visibility=View.GONE
    }

    override fun showMsg(msg: String) {
       Toast.makeText(context, msg,Toast.LENGTH_SHORT).show()

    }
    override lateinit var presenter: ProductView.presenter
    lateinit  var context: Context
    lateinit var recylerview_rating: RecyclerView
    var binding: ActivityProductListBinding?  = null
    lateinit var progressbar:ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_product_list);
        context=this
        presenter= ProductPresenter(this, context)
        init()
        presenter.Load_data()

    }



    fun init()
    {

        progressbar=findViewById(R.id.progressbar)
        recylerview_rating=findViewById(R.id.recylerview)
        val recyclerViewLayOutManager = LinearLayoutManager(context)
        recylerview_rating.layoutManager = recyclerViewLayOutManager

    }


}