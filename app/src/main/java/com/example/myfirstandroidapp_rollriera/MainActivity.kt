package com.example.myfirstandroidapp_rollriera


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

        // 확인버튼 이벤트 핸들러
        binding.OkBtn.setOnClickListener {
            Log.d("메인화면","버튼 눌림")
            Log.e("메인화면","에러")
        }

        // 취소버튼 이벤트 핸들러
        binding.cleBtn.setOnClickListener {
            Log.d("메인화면","취소 버튼 눌림")
            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()

        }




    }


}