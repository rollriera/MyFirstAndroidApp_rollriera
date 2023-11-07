package com.example.myfirstandroidapp_rollriera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMassageBinding

class MassageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMassageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMassageBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val msg = intent.getStringExtra("msg")
        binding.receivedMassageTxt.text = msg

    }
}