package com.example.sho.gof.factory

/**
 * Cookie shape factory (creator)
 *
 * Created by sho on 2018/10/19.
 */
class ShapeFactory {

    fun create(shapeName: String): Shape {
        return when(shapeName) {
            "Circle" -> CircleCookie()
            "Square" -> SquareCookie()
            "Star" -> StarCookie()
            else -> CircleCookie()
        }
    }
}