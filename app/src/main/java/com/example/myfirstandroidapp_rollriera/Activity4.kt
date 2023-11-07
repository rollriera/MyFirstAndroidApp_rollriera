package com.example.myfirstandroidapp_rollriera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myfirstandroidapp_rollriera.databinding.Activity4Binding
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMainBinding

class Activity4 : AppCompatActivity() {

    private lateinit var binding : Activity4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.returnToMainBtn.setOnClickListener {
            finish()
        }
    }
}