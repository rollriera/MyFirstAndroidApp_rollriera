package com.example.myfirstandroidapp_rollriera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.myfirstandroidapp_rollriera.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        각종 데이터 확인 => 앱 실행전에  필요한 사전 작업 수행.
        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({
                 // 2.5초 후에 실행할 내용 작성(메인화면으로 이동 + 지금 화면 종료)
            val myIntent = Intent(this,LoginActivity::class.java)

            startActivity(myIntent)

            finish()
        }, 2500)
    }
}