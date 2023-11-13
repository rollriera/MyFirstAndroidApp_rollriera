package com.example.myfirstandroidapp_rollriera.utils

import android.content.Context

class ContextUtil {

    companion object {
        private val prefName = "TestPref"

        private val AUTO_LOGIN = "AUTO_LOGIN"

        private val idText = "idText"

        private val ID_REMEMBER = "DI_REMEMBER"

        //자동 로그인 CheckBox를 체크했을 경우 실행될 함수
        fun setAutoLogin(context: Context, autoLogin: Boolean) {

            // prefName변수에 담긴 문자열과 같은 SharedPreferences파일을 찾고
            // 있으면 해당 파일 실행 없으면 해당명으로 생성

            //Context.MODE_PRIVATE를 이용해 해당SharedPreferences파일이 생성된
            //앱에서만 접근 가능하도록 지정 다른 앱과는 데이터 공유X
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

            // 해당 SharedPreferences파일을 수정하고 Boolean타입의 데이터를 넣어준다
            // 이때 AUTO_LOGIN(key)과 autoLOgin(value)을 넣어주고 apply메서드를 통해저장한다.
            pref.edit().putBoolean(AUTO_LOGIN, autoLogin).apply()
        }

        // 앱을 껏다켜도 다시 체크된 상태로 유지하기위한 함수(자동 로그인)
        fun getAutoLogin(context: Context): Boolean {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean(AUTO_LOGIN, false)
        }

        // 아이디 기억하기 CheckBox를 체크했을 경우 실행 함수
        fun setIdRemember(context: Context, idRemember: Boolean) {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(ID_REMEMBER, idRemember).apply()
        }

        // 앱을 껏다켜도 다시 체크된 상태로 유지하기 위한 함수(아이디 기억하기)
        fun getIdRemember(context: Context): Boolean {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean(ID_REMEMBER, false)
        }

        // 아이디 기억하기 체크박스를 체크한 경우 해당 id문자열을 저장하는 함수
        fun setIdText(context: Context, id: String) {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putString(idText, id).apply()
        }

        // 앱을 껏다 켜도 체크를 했을 경우 해당 id문자열값을 EditText에 기입시켜줄 함수
        fun getIdText(context: Context): String {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getString(idText, "") ?: ""
        }

    }
}