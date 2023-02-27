package com.example.aplicativo_gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicativo_gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
    }
}
