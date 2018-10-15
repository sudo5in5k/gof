package com.example.sho.gof

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.sho.gof.adapter.AlternatingCurrent
import com.example.sho.gof.adapter.DirectCurrent
import com.example.sho.gof.builder.Director
import com.example.sho.gof.builder.TextBuilder
import com.example.sho.gof.iterator.Instance
import com.example.sho.gof.observer.*
import com.example.sho.gof.singleton.Singleton
import com.example.sho.gof.state.StateActivity
import com.example.sho.gof.template.AbstractDisplay
import com.example.sho.gof.template.CharDisplay
import com.example.sho.gof.template.StringDisplay
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.name
    private val stateActivity = StateActivity::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iterator_button.setOnClickListener {
            Instance().iterator()
        }

        state_button.setOnClickListener {
            val intent = Intent(this, stateActivity)
            intent.putExtra(TAG, stateActivity.name)
            startActivity(intent)
        }

        observer_button.setOnClickListener {
            val earthquakeEvents: Events = EarthquakeEvents()
            val bigEarthQuakeObserver: Observer = BigEarthquakeObserver()
            val smallEarthQuakeObserver: Observer = SmallEarthquakeObserver()
            earthquakeEvents.addObserver(bigEarthQuakeObserver)
            earthquakeEvents.addObserver(smallEarthQuakeObserver)
            earthquakeEvents.execute()
        }

        adapter_button.setOnClickListener {
            val ac = AlternatingCurrent(DirectCurrent(12.0F))
            ac.show()
        }

        template_button.setOnClickListener {
            val charDisplay : AbstractDisplay = CharDisplay('H')
            val stringDisplay : AbstractDisplay = StringDisplay("Hello")
            charDisplay.display()
            stringDisplay.display()
        }

        singleton_button.setOnClickListener {
            val instance1 = Singleton()
            val instance2 = Singleton()
            if (instance1 == instance2) {
                Log.d(TAG, "両者のインスタンスは等しいです")
            } else {
                Log.d(TAG, "両者のインスタンスは等しくありません")
            }
        }

        builder_button.setOnClickListener {
            val textBuilder = TextBuilder()
            val director = Director(textBuilder)
            director.construct()
            Log.d(TAG, textBuilder.buffer.toString())
        }
    }
}
