package com.example.myfirstandroidapp_rollriera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstandroidapp_rollriera.databinding.ActivityViewRoomDetailBinding
import com.example.myfirstandroidapp_rollriera.datas.Room

class ViewRoomDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewRoomDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewRoomDetailBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

//        val roomData = intent.getSerializableExtra("room", Room::class.java)!!
        val roomData = intent.getParcelableExtra("room",Room::class.java)!!

        if (roomData != null) {
            binding.price.text = roomData.getFormattedPrice()
        }

        binding.descriptionTxt.text = roomData.description

        binding.roomAddr.text = roomData.addr

        binding.floorText.text = roomData.getFormattedFloor()


    }
}