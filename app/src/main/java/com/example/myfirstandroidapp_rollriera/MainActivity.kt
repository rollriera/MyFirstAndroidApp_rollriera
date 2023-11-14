package com.example.myfirstandroidapp_rollriera



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfirstandroidapp_rollriera.adapters.RoomAdapter
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMainBinding
import com.example.myfirstandroidapp_rollriera.datas.Room
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    // 멤버변수 선언
    val mRoomList = ArrayList<Room>()

    private lateinit var mRoomAdapter: RoomAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        // 데이터 ArrayList에 넣는다.
        mRoomList.add(Room(7500, "서울시 동대문구", 8, "동대문구의 8층 7500만원 방 입니다."))
        mRoomList.add(Room(24500, "서울시 서대문구", 0, "서대문구의 반지 2억 4500만원 방 입니다."))
        mRoomList.add(Room(24500, "서울시 동작구", 0, "동작구의 반지 1억 2300만원 방 입니다."))
        mRoomList.add(Room(24500, "서울시 은평구", -2, "은평구의 지하 2층 1억 4500만원 방 입니다."))
        mRoomList.add(Room(24500, "서울시 중랑구", 5, "중랑구의 5층 2억 4500만원 방 입니다."))
        mRoomList.add(Room(24500, "서울시 도봉구", 7, "도봉구의 7층 2억 8000만원 방 입니다."))
        mRoomList.add(Room(24500, "서울시 강남구", 19, "강남구의 19층 6억 4500만원 방 입니다."))
        mRoomList.add(Room(24500, "서울시 서초구", -1, "서초구의 지하 1층 1억 4500만원 방 입니다."))

        mRoomAdapter = RoomAdapter(mRoomList) { clickedRoom ->
            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            startActivity(myIntent)
        }

        binding.roomRecycleriew.adapter = mRoomAdapter

        binding.roomRecycleriew.layoutManager = LinearLayoutManager(this)






   }

}