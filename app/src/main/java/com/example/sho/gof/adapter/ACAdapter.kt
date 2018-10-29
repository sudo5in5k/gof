package com.example.sho.gof.adapter

import android.util.Log

/**
 * ACAdapter (from DC to AC)
 *
 * Created by sho on 2018/10/09.
 */
class ACAdapter(private var dc: DirectCurrent) : Volt {
    override var volt: Float
        get() = convertDCToAC(dc.volt)
        set(value) {}

    /**
     * Suppose x^2 / 2
     */
    private fun convertDCToAC(v: Float) = v * v / 2

    fun show() {
        Log.d(ACAdapter::class.java.name, volt.toString())
    }
}
