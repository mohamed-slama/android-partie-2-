package com.example.curriculumvitaev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.TextView

class SuccessActivity : AppCompatActivity() {
    private var name = "NONE"
    var EMAIL = "NAME"
    var AGE = "NAME"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        val  txtNameOUT = findViewById(R.id.Name1) as TextView
        val  txtEmailOUT = findViewById(R.id.Email1) as TextView
        name = intent.getStringExtra(name).toString()
        EMAIL = intent.getStringExtra(EMAIL).toString()
        AGE = intent.getStringExtra(AGE).toString()
        txtNameOUT.setText(name)
        txtEmailOUT.setText(EMAIL)
    }
}