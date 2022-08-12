package com.example.myapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginTvRegister.setOnClickListener { startActivity(Intent(this,RegisterActivity::class.java)) }

        binding.loginFabFacebook.setOnClickListener {
            showOtherOption("https://www.facebook.com/")
        }

        binding.loginFabGoogle.setOnClickListener {
            showOtherOption("https://www.google.com/")
        }
    }

    private fun showOtherOption(link : String){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(intent)
    }
}