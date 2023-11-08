package com.example.myfirstandroidapp_rollriera.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.myfirstandroidapp_rollriera.R
import com.example.myfirstandroidapp_rollriera.datas.Students
import java.util.Calendar

class StudentAdapter(val mContext : Context,
                     val resId : Int,
                     val mList : ArrayList<Students>) : ArrayAdapter<Students>(mContext,resId,mList) {

     val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthYear = row.findViewById<TextView>(R.id.birthYearTxt)

        val caleander = Calendar.getInstance();
        val nowYear = caleander.get(Calendar.YEAR)

        var age = nowYear - mList[position].birthYear

        nameTxt.text = mList[position].name
        birthYear.text = "(${age}세)"

        return row

    }


}