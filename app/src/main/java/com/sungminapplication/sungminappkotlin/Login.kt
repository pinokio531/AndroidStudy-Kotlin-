package com.sungminapplication.sungminappkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.inu_club_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inu_club_login)

        //람다 함수 onClick
        btn_login.setOnClickListener{
            startActivity(Intent(this@Login, Event_edit::class.java))
        }
    }
}