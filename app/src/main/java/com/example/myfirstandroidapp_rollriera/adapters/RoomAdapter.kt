package com.example.myfirstandroidapp_rollriera.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.myfirstandroidapp_rollriera.R
import com.example.myfirstandroidapp_rollriera.datas.Room

class RoomAdapter(val mContext : Context, val resId : Int, val mList : List<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inflater.inflate(R.layout.room_list_item, null)
        }

        var row = tempRow!!

        val roomData = mList[position]


        val priceText = row.findViewById<TextView>(R.id.roomPrice)
        val addrAndFloor = row.findViewById<TextView>(R.id.roomAddr)
        val description = row.findViewById<TextView>(R.id.description)


        priceText.text = roomData.getFormattedPrice()

        addrAndFloor.text = "${roomData.addr}, ${roomData.getFormattedFloor()}"

        description.text = roomData.description

        return row
    }

}