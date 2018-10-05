package com.example.sho.gof

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sho.gof.iterator.Instance
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iterator_button.setOnClickListener {
            Instance().iterator()
        }
    }


}
