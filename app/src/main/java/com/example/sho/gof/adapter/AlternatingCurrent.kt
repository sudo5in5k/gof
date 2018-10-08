package com.example.sho.gof.adapter

import android.util.Log

/**
 * Concrete DirectCurrent
 *
 * Created by sho on 2018/10/09.
 */
class AlternatingCurrent(private var dc: DirectCurrent) : Volt {
    override var volt: Float
        get() = convertDCToAC(dc.volt)
        set(value) {}

    /**
     * Suppose x^2 / 2
     */
    private fun convertDCToAC(v: Float) = v * v / 2

    fun show() {
        Log.d(AlternatingCurrent::class.java.name, volt.toString())
    }

}
