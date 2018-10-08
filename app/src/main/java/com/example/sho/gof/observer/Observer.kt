package com.example.sho.gof.observer

/**
 * Observer
 *
 * Created by sho on 2018/10/08.
 */
interface Observer {
    fun update(generator: NumberGenerator)
}