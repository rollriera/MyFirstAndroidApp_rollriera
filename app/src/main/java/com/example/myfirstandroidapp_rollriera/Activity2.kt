package com.example.myfirstandroidapp_rollriera

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMainBinding

class Activity2: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        val myName = "상수"
        var myAge = "변수"

        //myName = "변경"
        //myAge = "변경"

        Log.d("상수",myName)
        Log.d("변수",myAge)

        val userAge = 25

        if(userAge >= 20){
            Log.d("사용자의나이","성인입니다.");
        }else{
            Log.d("사용자의 나이","학생입니다.");
        }

        binding.okBtn.setOnClickListener{


            //입력된 내용 : contentEdt 의 text 값 조회 변수에 저장(get)
            var inputContent = binding.contentEdt.text.toString();

//            Log.d("inputContent입력내용",inputContent)

            //저장해둔 입력값을 => 텍스트뷰의 내용으로 반영(set)
            binding.resultTxt.text = inputContent;

        }

    }
}