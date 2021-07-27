package com.example.smartconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var userFahrenheit = findViewById<EditText>(R.id.fahrenheit)
        var userCelsius = findViewById<EditText>(R.id.celsius)
        var converterButton = findViewById<Button>(R.id.converter)
        var resetButton = findViewById<Button>(R.id.reset)

        converterButton.setOnClickListener {
            if (userCelsius.text.toString().isEmpty()) {
                val userInputFahrenheit = userFahrenheit.text.toString().toFloat()
                val userResultsCelsius = (userInputFahrenheit - 32) * 5 / 9
                userCelsius.setText(userResultsCelsius.toString())
            } else {
                val userInputCelsius = userCelsius.text.toString().toFloat()
                val userResultsFahrenheit = (userInputCelsius * 1.8) + 32
                userFahrenheit.setText(userResultsFahrenheit.toString())
            }
            resetButton.setOnClickListener {
                userCelsius.getText().clear()
                userFahrenheit.getText().clear()
            }


        }
    }
}