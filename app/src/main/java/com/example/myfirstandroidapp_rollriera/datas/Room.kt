package com.example.myfirstandroidapp_rollriera.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.Locale
import kotlin.math.abs

//방 표현 데이터클래스
class Room(val price : Int,
           val addr : String,
           val floor : Int,
           val description : String) : Serializable {

    // 가격 가공 함수
    fun getFormattedPrice() : String{
        var result = ""

        if(price >= 10000){

            val uk = "${price / 10000}억"
            val own = "${NumberFormat.getNumberInstance(Locale.KOREA).format(price % 10000)}원"
            result = uk +" "+ own
        }else {
            result = NumberFormat.getNumberInstance(Locale.KOREA).format(price).toString()+"원"
        }

        return result
    }

    // 층수 가공 함수
    fun getFormattedFloor() : String{

        var result = ""

        if(floor >= 1){
            result = "${floor}층"
        }else if(floor == 0){
            result = "반지하"
        }else{
            result = "지하 ${-floor}층"
        }

        return result

    }
}