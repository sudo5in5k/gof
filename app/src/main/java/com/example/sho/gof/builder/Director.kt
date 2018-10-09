package com.example.sho.gof.builder

/**
 * TODO クラス説明
 *
 * Created by sho on 2018/10/09.
 */
class Director(private val builder: Builder) {

    fun construct() {
        builder.makeTitle("Hello")
        builder.makeBody("How are you?")
        builder.makeItems(listOf("I'm fine thank you",
                "and you?"))
        builder.makeTitle("Good evening")
        builder.makeBody("Are you sleepy?")
        builder.makeItems(listOf("Yes...", "But..."))
        builder.close()
    }
}
