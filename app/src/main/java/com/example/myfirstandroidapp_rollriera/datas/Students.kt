package com.example.myfirstandroidapp_rollriera.datas

import android.util.Log
import java.util.Calendar

// 학생 하위정보 - 이름, 출생년도

class Students(var name:String, var birthYear:Int) {

    // 현재 나이를 계산하는 함수
    fun resultToAge(birth : Int) : Int{
        val calendar = Calendar.getInstance()
        val nowYear = calendar.get(Calendar.YEAR)
        val result = nowYear - birth
        return result
    }
}