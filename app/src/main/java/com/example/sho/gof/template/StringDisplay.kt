package com.example.sho.gof.template

import android.util.Log

/**
 * Concrete string display
 *
 * Created by sho on 2018/10/09.
 */
class StringDisplay(private val string: String) : AbstractDisplay() {

    private val name = StringDisplay::class.java.name
    private val length = string.length

    override fun open() {
        printLine()
    }

    override fun print() {
        Log.d(name, "|$string|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        Log.d(name, "+")
        for (i: Int in 0..length) run{
            Log.d(name, "-")
        }
    }
}