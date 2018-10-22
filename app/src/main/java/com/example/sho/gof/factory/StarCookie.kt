package com.example.sho.gof.factory

import android.util.Log

/**
 * Concrete product
 *
 * Created by sho on 2018/10/22.
 */
class StarCookie : Shape() {

    override fun fit() {
        Log.d("ushi_debug", "星型のクッキーが焼き上がりました")
    }

}