package com.example.myfirstandroidapp_rollriera

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class Intent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 전화 연결 직전(DIAL)
//        binding.dialBtn.setOnClickListener {
//
//            // EditText에 입력한 번호를 가져옴
//            var inputPhoneNum = binding.phoneNumEdt.text.toString()
//
//            var myUri = Uri.parse("tel:${inputPhoneNum}")
//
//            var myIntent = Intent(Intent.ACTION_DIAL, myUri)
//            startActivity(myIntent)
//        }
//
//        // 전화 연결(CALL) (사용자에게 권한 을 받아야 전화가 걸림)
//        binding.callBtn.setOnClickListener {
//            var inputPhoneNum = binding.phoneNumEdt.text.toString()
//
//            var myUri = Uri.parse("tel:${inputPhoneNum}")
//
//            var myIntent = Intent(Intent.ACTION_CALL, myUri)
//            startActivity(myIntent)
//        }
//
//        // 문자 화면 이동
//        binding.smsBtn.setOnClickListener {
//            var inputPhoneNum = binding.phoneNumEdt.text.toString()
//
//            var myUri = Uri.parse("smsto:${inputPhoneNum}")
//
//            var myIntent = Intent(Intent.ACTION_SENDTO, myUri)
//            myIntent.putExtra("sms_body","미리 내용 입력")
//            startActivity(myIntent)
//        }
//
//        // 다른 화면으로 이동
//        binding.moveToOtherBtn.setOnClickListener {
//            val myIntent = Intent(this, Activity4::class.java)
//            startActivity(myIntent)
//        }
//
//        binding.kakaoStoreBtn.setOnClickListener {
//
//            var myUri = Uri.parse("market://details?id=com.kakao.talk")
//
//            var myIntent = Intent(Intent.ACTION_VIEW, myUri)
//            startActivity(myIntent)
//        }
//
//        binding.naverWebBtn.setOnClickListener {
//
//            var myUri = Uri.parse("https://naver.com")
//
//            var myIntent = Intent(Intent.ACTION_VIEW, myUri)
//            startActivity(myIntent)
//        }
//
//        binding.sendMessageBtn.setOnClickListener {
//
//            val msg = binding.messageEdt.text.toString()
//
//            val myIntent = Intent(this, MassageActivity::class.java)
//            myIntent.putExtra("msg",msg)
//            startActivity(myIntent)
//        }
//
//        binding.changeNickNameBtn.setOnClickListener {
//            val oldName = binding.oldNickName.text.toString()
//            val myIntent = Intent(this,ChangeNickNameActivity::class.java)
//            changeNickNameLauncher.launch(myIntent)
//        }
    }
}