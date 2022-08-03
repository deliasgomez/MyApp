package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        setTheme(R.style.LoginTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}