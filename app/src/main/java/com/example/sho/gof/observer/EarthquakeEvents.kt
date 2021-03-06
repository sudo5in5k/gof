package com.example.sho.gof.observer

import java.util.*

/**
 * 大きい地震を検知する Concrete Observer
 *
 * Created by sho on 2018/10/08.
 */
class EarthquakeEvents : Events() {

    private var random: Random = Random()

    override fun execute() {
        for (i: Int in 0..20) {
            number = random.nextInt(10)
            notifyObservers()
        }
    }
}