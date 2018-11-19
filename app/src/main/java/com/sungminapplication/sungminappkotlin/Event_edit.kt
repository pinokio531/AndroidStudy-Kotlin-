package com.sungminapplication.sungminappkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.inu_club_event_edit.*

class Event_edit : AppCompatActivity(), View.OnClickListener  { //인터페이스, 상속 다 가능

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inu_club_event_edit)

        btn_submit.setOnClickListener(this)
        btn_submit.setOnClickListener(customListen)
    }

    //람다 함수 이용한 onClick
    override fun onClick(v: View?) {
        Toast.makeText(applicationContext, "Submit 버튼입니다", Toast.LENGTH_SHORT).show()
    }

    //커스텀 하게 생성
    val customListen = View.OnClickListener{
        Toast.makeText(applicationContext, "Submit 버튼입니다", Toast.LENGTH_SHORT).show()
    }

}