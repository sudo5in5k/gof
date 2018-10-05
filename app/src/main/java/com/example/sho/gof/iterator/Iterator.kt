package com.example.sho.gof.iterator

/**
 * 繰り返しのinterface
 *
 * Created by sho on 2018/10/04.
 */
interface Iterator {
    val hasNext: Boolean
    val next: Any
}