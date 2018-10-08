package com.example.sho.gof

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sho.gof.adapter.DirectCurrent
import com.example.sho.gof.adapter.AlternatingCurrent
import com.example.sho.gof.iterator.Instance
import com.example.sho.gof.observer.DigitObserver
import com.example.sho.gof.observer.NumberGenerator
import com.example.sho.gof.observer.Observer
import com.example.sho.gof.observer.RandomNumberGenerator
import com.example.sho.gof.state.StateActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    private val EXTRA_MESSAGE = MainActivity::class.java.name
    private val stateActivity = StateActivity::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iterator_button.setOnClickListener {
            Instance().iterator()
        }

        state_button.setOnClickListener {
            val intent = Intent(this, stateActivity)
            intent.putExtra(EXTRA_MESSAGE, stateActivity.name)
            startActivity(intent)
        }

        observer_button.setOnClickListener {
            val generator: NumberGenerator = RandomNumberGenerator()
            val observer: Observer = DigitObserver()
            generator.addObserver(observer)
            generator.execute()
        }

        adapter_button.setOnClickListener {
            val ac = AlternatingCurrent(DirectCurrent(12.0F))
            ac.show()
        }
    }
}
