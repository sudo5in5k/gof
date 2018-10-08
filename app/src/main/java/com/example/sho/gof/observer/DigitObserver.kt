package com.example.sho.gof.observer

import android.util.Log

/**
 * TODO クラス説明
 *
 * Created by sho on 2018/10/08.
 */
class DigitObserver : Observer {

    override fun update(generator: NumberGenerator) {
        val number = generator.number
        val className = DigitObserver::class.java.name
        Log.d("ushi_debug", "call number $number from $className")
    }

}