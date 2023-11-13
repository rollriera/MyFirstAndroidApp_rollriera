package com.example.myfirstandroidapp_rollriera.utils

import android.content.Context

class ContextUtil {

    companion object{
        private val prefName = "TestPref"

        private val AUTO_LOGIN = "AUTO_LOGIN"

        private val idText = "id"

        private val ID_REMEMBER = "DI_REMEMBER"

        fun setAutoLogin(context: Context, autoLogin : Boolean){

            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(AUTO_LOGIN, autoLogin).apply()
        }

        fun getAutoLogin(context: Context) : Boolean{
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean(AUTO_LOGIN, false)
        }

        fun setIdRemember(context: Context, idRemember : Boolean){
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(ID_REMEMBER, idRemember).apply()
        }

        fun getIdRemember(context: Context) : Boolean{
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean(ID_REMEMBER, false)
        }

        fun setIdText(context: Context, id : String){
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putString(idText, id).apply()
        }

        fun getIdText(context: Context) : String{
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getString(idText,"")?:""
        }
    }
}