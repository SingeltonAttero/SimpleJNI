package com.weber.testc

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.weber.testc.model.StoreType
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        typeSpinner.adapter =
            ArrayAdapter<StoreType>(this, android.R.layout.simple_spinner_item, StoreType.values())
    }

}
