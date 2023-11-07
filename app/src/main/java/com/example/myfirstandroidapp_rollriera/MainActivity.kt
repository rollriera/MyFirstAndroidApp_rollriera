package com.example.myfirstandroidapp_rollriera


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // 다른 화면으로 이동
        binding.moveToOtherBtn.setOnClickListener {
            val myIntent = Intent(this, Activity4::class.java)
            startActivity(myIntent)
        }

    }


}