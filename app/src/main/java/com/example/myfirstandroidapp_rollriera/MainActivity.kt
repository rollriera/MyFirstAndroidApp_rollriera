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

//    private val changeNickNameLauncher = registerForActivityResult(
//        ActivityResultContracts.StartActivityForResult()
//    ) { result ->
//        if (result.resultCode == Activity.RESULT_OK) {
//            if (result.data != null) {
//                val newNickName = result.data?.getStringExtra("newNickName")
//                // TextView에 새 닉네임을 설정
//                binding.oldNickName.text = newNickName
//            }
//        }
//    }


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

//        // 전화 연결 직전(DIAL)
//        binding.dialBtn.setOnClickListener {
//
//            // EditText에 입력한 번호를 가져옴
//            var inputPhoneNum = binding.phoneNumEdt.text.toString()
//
//            var myUri = Uri.parse("tel:${inputPhoneNum}")
//
//            var myIntent = Intent(Intent.ACTION_DIAL, myUri)
//            startActivity(myIntent)
//        }
//
//        // 전화 연결(CALL) (사용자에게 권한 을 받아야 전화가 걸림)
//        binding.callBtn.setOnClickListener {
//            var inputPhoneNum = binding.phoneNumEdt.text.toString()
//
//            var myUri = Uri.parse("tel:${inputPhoneNum}")
//
//            var myIntent = Intent(Intent.ACTION_CALL, myUri)
//            startActivity(myIntent)
//        }
//
//        // 문자 화면 이동
//        binding.smsBtn.setOnClickListener {
//            var inputPhoneNum = binding.phoneNumEdt.text.toString()
//
//            var myUri = Uri.parse("smsto:${inputPhoneNum}")
//
//            var myIntent = Intent(Intent.ACTION_SENDTO, myUri)
//            myIntent.putExtra("sms_body","미리 내용 입력")
//            startActivity(myIntent)
//        }
//
//        // 다른 화면으로 이동
//        binding.moveToOtherBtn.setOnClickListener {
//            val myIntent = Intent(this, Activity4::class.java)
//            startActivity(myIntent)
//        }
//
//        binding.kakaoStoreBtn.setOnClickListener {
//
//            var myUri = Uri.parse("market://details?id=com.kakao.talk")
//
//            var myIntent = Intent(Intent.ACTION_VIEW, myUri)
//            startActivity(myIntent)
//        }
//
//        binding.naverWebBtn.setOnClickListener {
//
//            var myUri = Uri.parse("https://naver.com")
//
//            var myIntent = Intent(Intent.ACTION_VIEW, myUri)
//            startActivity(myIntent)
//        }
//
//        binding.sendMessageBtn.setOnClickListener {
//
//            val msg = binding.messageEdt.text.toString()
//
//            val myIntent = Intent(this, MassageActivity::class.java)
//            myIntent.putExtra("msg",msg)
//            startActivity(myIntent)
//        }
//
//        binding.changeNickNameBtn.setOnClickListener {
//            val oldName = binding.oldNickName.text.toString()
//            val myIntent = Intent(this,ChangeNickNameActivity::class.java)
//            changeNickNameLauncher.launch(myIntent)
//        }

   }


}