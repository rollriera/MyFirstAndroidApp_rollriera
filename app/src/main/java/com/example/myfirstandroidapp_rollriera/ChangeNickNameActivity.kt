package com.example.myfirstandroidapp_rollriera

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstandroidapp_rollriera.databinding.ActivityChangeNickNameBinding

class ChangeNickNameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChangeNickNameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangeNickNameBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.changeOkBtn.setOnClickListener {
            val newNickName = binding.newNickNameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("newNickName", newNickName)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}