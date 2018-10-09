package com.example.sho.gof.template

/**
 * Displayの抽象クラス
 *
 * Created by sho on 2018/10/09.
 */
abstract class AbstractDisplay {
    abstract fun open()
    abstract fun print()
    abstract fun close()
    fun display() {
        open()
        for (i: Int in 0..5) {
            print()
        }
        close()
    }
}