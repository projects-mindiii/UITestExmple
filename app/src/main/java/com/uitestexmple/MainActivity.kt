package com.uitestexmple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import androidx.databinding.DataBindingUtil
import com.uitestexmple.databinding.ActivityMainBinding

/**
 * @author Avinash Kumar
 * @mail avisingh736@gmail.com
 * */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.tietEmail.inputType = InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
        binding.tietPassword.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}