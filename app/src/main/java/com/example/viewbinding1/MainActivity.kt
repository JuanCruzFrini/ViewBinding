package com.example.viewbinding1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbinding1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root) //root es todo lo que contiene el xml

        binding.btnSaludar.setOnClickListener {
            updateText("Hola " + binding.ET.text.toString())
        }
    }

    private fun updateText(text:String){
        binding.text.text = text
    }
}