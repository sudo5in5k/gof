package com.example.sho.gof.factory

import android.util.Log

/**
 * Concrete product
 *
 * Created by sho on 2018/10/19.
 */
class CircleCookie() : Shape() {

    override fun fit() {
        Log.d("ushi_debug", "丸型のクッキーが焼き上がりました")
    }

}