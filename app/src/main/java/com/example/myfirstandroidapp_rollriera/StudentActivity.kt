package com.example.myfirstandroidapp_rollriera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstandroidapp_rollriera.databinding.ActivityStudentBinding

class StudentActivity : AppCompatActivity() {
//    val mStudentList = ArrayList<Students>()

//    lateinit var mAdapter : StudentAdapter
    private lateinit var binding: ActivityStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

//        mStudentList.add(Students("홍길동",1999))
//        mStudentList.add(Students("둘리",1979))
//        mStudentList.add(Students("또치",1989))
//        mStudentList.add(Students("하니",2000))
//        mStudentList.add(Students("길동",2003))
//        mStudentList.add(Students("보라돌이",1969))
//        mStudentList.add(Students("뚜비",2001))
//
//        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
//
//        binding.studentListView.adapter = mAdapter
//
//        // 리스트의 이벤트(그냥 눌렀을때의 이벤트)
//        binding.studentListView.setOnItemClickListener { adapterView, view, position, id ->
//
//            val clickedStudent = mStudentList[position].name
//
//            Toast.makeText(this, "${clickedStudent}", Toast.LENGTH_SHORT).show()
//
//        }
//
//        // 리스트의 이벤트(길게 눌렀을때의 이벤트)
//        binding.studentListView.setOnItemLongClickListener { adapterView, view, position, id ->
//
//            //리스트 삭제(그냥 실행하면 앱이 죽어버림)
//            mStudentList.removeAt(position)
//
//            mAdapter.notifyDataSetChanged()
//
//
//            return@setOnItemLongClickListener true
//        }

    }
}