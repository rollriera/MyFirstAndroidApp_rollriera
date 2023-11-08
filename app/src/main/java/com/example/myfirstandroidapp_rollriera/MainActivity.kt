package com.example.myfirstandroidapp_rollriera


import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.myfirstandroidapp_rollriera.adapters.StudentAdapter
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMainBinding
import com.example.myfirstandroidapp_rollriera.databinding.ActivityMassageBinding
import com.example.myfirstandroidapp_rollriera.datas.Students


class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Students>()

    lateinit var mAdapter : StudentAdapter

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mStudentList.add(Students("홍길동",1999))
        mStudentList.add(Students("둘리",1979))
        mStudentList.add(Students("또치",1989))
        mStudentList.add(Students("하니",2000))
        mStudentList.add(Students("길동",2003))
        mStudentList.add(Students("보라돌이",1969))
        mStudentList.add(Students("뚜비",2001))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        binding.studentListView.adapter = mAdapter

        // 리스트의 이벤트(그냥 눌렀을때의 이벤트)
        binding.studentListView.setOnItemClickListener { adapterView, view, position, id ->

            val clickedStudent = mStudentList[position].name

            Toast.makeText(this, "${clickedStudent}", Toast.LENGTH_SHORT).show()

        }

        // 리스트의 이벤트(길게 눌렀을때의 이벤트)
        binding.studentListView.setOnItemLongClickListener { adapterView, view, position, id ->

            //리스트 삭제(그냥 실행하면 앱이 죽어버림)
            mStudentList.removeAt(position)

            mAdapter.notifyDataSetChanged()


            return@setOnItemLongClickListener true
        }


   }


}