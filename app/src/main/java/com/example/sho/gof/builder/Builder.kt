package com.example.sho.gof.builder

/**
 * TODO クラス説明
 *
 * Created by sho on 2018/10/09.
 */
abstract interface Builder {
    abstract fun makeTitle(title: String)
    abstract fun makeBody(body: String)
    abstract fun makeItems(items: List<String>)
    abstract fun close()
}