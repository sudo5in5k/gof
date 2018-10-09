package com.example.sho.gof.template

import android.util.Log

/**
 * Concrete char display
 *
 * Created by sho on 2018/10/09.
 */
class CharDisplay(private val char: Char) : AbstractDisplay() {

    private val name = CharDisplay::class.java.name

    override fun open() {
        Log.d(name, "<<")
    }

    override fun print() {
        Log.d(name, char.toString())
    }

    override fun close() {
        Log.d(name, ">>")
    }

}