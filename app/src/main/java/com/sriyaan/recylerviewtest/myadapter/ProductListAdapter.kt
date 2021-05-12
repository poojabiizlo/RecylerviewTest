package com.sriyaan.recylerviewtest.myadapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sriyaan.recylerviewtest.CommonUtils.CommonUtil
import com.sriyaan.recylerviewtest.CommonUtils.loadImage_normal

import com.sriyaan.recylerviewtest.R
import com.sriyaan.recylerviewtest.modelresponse.Product_data


class ProductListAdapter(

    innerDataList: List<Product_data>

):RecyclerView.Adapter<ProductListAdapter.MyViewHolder>() {

    var item_list=innerDataList
    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){

        val img_product=view.findViewById<ImageView>(R.id.img_product)
        val txt_title=view.findViewById<TextView>(R.id.txt_tit)
        val txt_type=view.findViewById<TextView>(R.id.txt_type)
        val txt_desc=view.findViewById<TextView>(R.id.txt_desc)



    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return MyViewHolder(
            v
        )
    }


    override fun getItemCount(): Int {
        return item_list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        holder.txt_title.setText(item_list.get(position).title)
        holder.txt_type.setText(item_list.get(position).type)
        holder.txt_desc.setText(item_list.get(position).description)
        holder.img_product.loadImage_normal(item_list.get(position).filename)




    }




}