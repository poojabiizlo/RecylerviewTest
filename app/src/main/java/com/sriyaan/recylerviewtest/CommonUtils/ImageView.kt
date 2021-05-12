package com.sriyaan.recylerviewtest.CommonUtils

import android.graphics.Bitmap
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.sriyaan.recylerviewtest.R



    internal fun ImageView.loadImage_normal(url: String) {
        Glide.with(this.context).load(url)
            .transition(DrawableTransitionOptions().crossFade()).centerCrop().apply(RequestOptions().placeholder(R.drawable.ic_launcher_background)).into(this)





}
