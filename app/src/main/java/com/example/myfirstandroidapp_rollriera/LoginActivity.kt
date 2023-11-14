package com.example.myfirstandroidapp_rollriera

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import com.example.myfirstandroidapp_rollriera.databinding.ActivityLoginBinding
import com.example.myfirstandroidapp_rollriera.utils.ContextUtil

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.autoLoginCheckBox.setOnCheckedChangeListener { compoundButton, isChecked ->
            // 지금 체크된 상황을 그대로 => ContextUtil을 이용해 자동로그인 여부로 저장.
            ContextUtil.setAutoLogin(this, isChecked)
        }
        // 화면이 만들어지면 => 저장된 자동로그인 여부 값을 => 체크박스에 반영
        binding.autoLoginCheckBox.isChecked = ContextUtil.getAutoLogin(this)

        binding.idRememberCheckBox.setOnCheckedChangeListener { compoundButton, isChecked ->
            ContextUtil.setIdRemember(this, isChecked)
        }
        if(ContextUtil.getIdRemember(this)){
            binding.idRememberCheckBox.isChecked = true
        }

        binding.loginBtn.setOnClickListener {
            if(binding.idRememberCheckBox.isChecked == true){
                ContextUtil.setIdText(this, binding.userIdText.text.toString())
            }else{
                ContextUtil.setIdText(this, "")
            }
            val result = ContextUtil.getIdText(this)
            binding.userIdText.text = Editable.Factory.getInstance().newEditable(result)

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

    }
}