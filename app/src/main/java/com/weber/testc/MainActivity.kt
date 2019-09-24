package com.weber.testc

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.weber.testc.lib.Clib
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

    private fun getValueStore() {
        val key = inputKey.text.toString()
        val storeType = typeSpinner.selectedItem as StoreType
        if (keyPattern.matcher(key).matches()) {
            errorMessage(key)
        }

        when (storeType) {
            StoreType.DATE -> {
                infoToast(storeType)
            }
            StoreType.TEXT -> {
                inputValue.setText(Clib.getText())
            }
            StoreType.INT -> {
                infoToast(storeType)
            }
        }

    }

    private fun infoToast(storeType: StoreType) {
        Toast.makeText(this, storeType.name, Toast.LENGTH_SHORT).show()
    }

    private fun setValueStore() {
        val key = inputKey.text.toString()
        val value = inputValue.text.toString()
        val storeType = typeSpinner.selectedItem as StoreType

        if (!keyPattern.matcher(key).matches()) {
            errorMessage(key)
            return
        }
        when (storeType) {
            StoreType.DATE -> {
                infoToast(storeType)
            }
            StoreType.TEXT -> {
                Clib.setText(key, value)
            }
            StoreType.INT -> {
                infoToast(storeType)
            }
        }
        updateTitle()
    }

    private fun updateTitle() {

    }

    private fun errorMessage(key: String) {
        Toast.makeText(this, "this key = $key incorrect", Toast.LENGTH_SHORT).show()
    }


}
