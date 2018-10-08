package com.example.sho.gof.state

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.sho.gof.R
import kotlinx.android.synthetic.main.activity_state.*
import java.util.*

/**
 * StateパターンのActivity
 *
 * Created by sho on 2018/10/08.
 */
class StateActivity : AppCompatActivity(), Contexer {

    private var state: State = DayState()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state)

        change_state_button.setOnClickListener {
            val randHour = Random().nextInt(24)
            Log.d("ushi_debug", randHour.toString())
            state.clock(this, randHour)
        }

        safe_button.setOnClickListener {
            state.use(this)
        }

        emergency_bell_button.setOnClickListener {
            state.alarm(this)
        }

        call_button.setOnClickListener {
            state.phone(this)
        }
    }

    override fun setClock(hour: Int) {
        val clockStr = "現在時刻は, " + if (hour < 10) {
            "0$hour:00"
        } else {
            "$hour:00"
        }
        current_time_text.text = clockStr
    }

    override fun changeState(state: State) {
        Log.d("ushi_debug", "${this.state}から${state}へ状態が変化")
        this.state = state
    }

    override fun callSecurity(msg: String) {
        Log.d("ushi_debug", "call $msg !")
    }

    override fun recordLog(msg: String) {
        Log.d("ushi_debug", "record $msg !")
    }
}