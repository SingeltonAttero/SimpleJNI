package com.weber.testc

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.weber.testc.model.StoreType
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    private lateinit var keyPattern: Pattern

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        keyPattern = Pattern.compile("\\p{Alnum}+")
        typeSpinner.adapter =
            ArrayAdapter<StoreType>(this, android.R.layout.simple_spinner_item, StoreType.values())

        getValueButton.setOnClickListener {
            getValueStore()
        }

        setValueButton.setOnClickListener {
            setValueStore()
        }



    }

    private fun setValueStore() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun getValueStore() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
