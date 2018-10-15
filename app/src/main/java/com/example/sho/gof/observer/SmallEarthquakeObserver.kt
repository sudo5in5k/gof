package com.example.sho.gof.observer

import android.util.Log

/**
 * 小規模の地震が起きたら検知する concrete observer B
 *
 * Created by sho on 2018/10/12.
 */
class SmallEarthquakeObserver: Observer {

    override fun inspect(events: Events) {
        val magnitude = events.number
        // マグニチュードが3以上6未満であれば検知
        if (magnitude in 3..5) {
            Log.d("Small earthQuake happened", "magnitude $magnitude")
        }
    }

}