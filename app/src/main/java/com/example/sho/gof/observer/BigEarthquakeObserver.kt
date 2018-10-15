package com.example.sho.gof.observer

import android.util.Log

/**
 * 大地震が起きたら検知する concrete observer A
 *
 * Created by sho on 2018/10/08.
 */
class BigEarthquakeObserver : Observer {

    override fun inspect(events: Events) {
        val magnitude = events.number
        if (magnitude >= 6) {
            Log.d("Big earthQuake happened", "magnitude $magnitude")
        }
    }

}