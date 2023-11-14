package com.example.myfirstandroidapp_rollriera.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstandroidapp_rollriera.R
import com.example.myfirstandroidapp_rollriera.databinding.RoomListItemBinding
import com.example.myfirstandroidapp_rollriera.datas.Room

class RoomAdapter(private val roomList : ArrayList<Room>, private val itemClickListener: (Room) -> Unit) :
    RecyclerView.Adapter<RoomAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding : RoomListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Room) {
            binding.roomPrice.text = item.price.toString()
            binding.roomAddr.text = item.addr
            binding.description.text = item.description

            itemView.setOnClickListener {
                itemClickListener.invoke(item)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RoomListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val room = roomList[position]
        holder.bind(room)
    }

    override fun getItemCount(): Int {
        return roomList.size
    }
}
