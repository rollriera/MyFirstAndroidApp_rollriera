package com.example.myfirstandroidapp_rollriera


import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMainBinding
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMassageBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val changeNickNameLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            if (result.data != null) {
                val newNickName = result.data?.getStringExtra("newNickName")
                // TextView에 새 닉네임을 설정
                binding.oldNickName.text = newNickName
            }
        }
    }


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

        binding.sendMessageBtn.setOnClickListener {

            val msg = binding.messageEdt.text.toString()

            val myIntent = Intent(this, MassageActivity::class.java)
            myIntent.putExtra("msg",msg)
            startActivity(myIntent)
        }

        binding.changeNickNameBtn.setOnClickListener {
            val oldName = binding.oldNickName.text.toString()
            val myIntent = Intent(this,ChangeNickNameActivity::class.java)
            changeNickNameLauncher.launch(myIntent)
        }

   }


}