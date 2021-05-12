package com.sriyaan.recylerviewtest.RecylerviewTest

import android.content.Context
import com.sriyaan.recylerviewtest.NetworkControler.RetrofitBuilder
import com.sriyaan.recylerviewtest.modelresponse.Product_data

import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class ProductPresenter(val view: ProductView.view,val context: Context):ProductView.presenter {

    init {
        view.presenter=this
    }
    override fun Load_data() {

       val request= RetrofitBuilder.apiService
        request.Load_Product().subscribeOn(
            Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith( object : Observer<List<Product_data>> {
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable) {

                }

                override fun onNext(response_value: List<Product_data>) {
                    view.hideloading()
                    view.LoadData(response_value)


                }

                override fun onError(e: Throwable) {
                    view.hideloading()
                    view.showMsg(e.message.toString())
                }


            }

            )
    }
}