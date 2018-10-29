package com.example.sho.gof.mediator

/**
 * Subject interface
 *
 * Created by sho on 2018/10/24.
 */
data class Inquiry(username: String = "Bob", mediator: Mediator) {

    abstract fun request(msg: String)
    abstract fun response(msg: String)
}