package com.example.myfirstandroidapp_rollriera

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMainBinding

class Activity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

//        binding.loginBtn.setOnClickListener {
//            var id = binding.id.text.toString().equals("admin@test.com")
//            var pwd = binding.pwd.text.toString().equals("qwer")
//
//            if(id && pwd){
//                Toast.makeText(this, "관리자 입니다.", Toast.LENGTH_SHORT).show()
//            }else{
//                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
//            }
//        }

    }
}