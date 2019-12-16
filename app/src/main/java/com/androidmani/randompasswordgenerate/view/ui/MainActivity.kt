package com.androidmani.randompasswordgenerate.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import com.androidmani.randompasswordgenerate.R
import com.androidmani.randompasswordgenerate.util.RandomPassword

class MainActivity : AppCompatActivity() {

    private lateinit var tv_password: AppCompatTextView
    private lateinit var btn_generate: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_password = findViewById(R.id.tv_password)
        btn_generate = findViewById(R.id.appCompatButton)
        btn_generate.setOnClickListener(View.OnClickListener {

            val randomPassword = RandomPassword();
            tv_password.setText(randomPassword.generateRandomPassword(true, true, true, false, 6))

        })

    }
}
