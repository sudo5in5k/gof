package com.example.sho.gof.singleton

import android.util.Log

/**
 * Singleton
 *
 * Created by sho on 2018/10/09.
 */
class Singleton {

    private val name = Singleton::class.java.name

    init {
        Log.d(name, "インスタンスを生成しました")
    }
}