package com.example.curriculumvitaev2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings.NameValueTable.NAME
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    private var checkBoxA : CheckBox? = null
    private var checkBoxF : CheckBox? = null
    private var checkBoxE : CheckBox? = null
    private var checkBoxM : CheckBox? = null
    private var checkBoxS : CheckBox? = null
    private var checkBoG : CheckBox? = null
    private var btnSubmit : Button? = null
    private var name = "NONE"
    var EMAIL = "NAME"
    var AGE = "NAME"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        checkBoxA = findViewById(R.id.Arabic)
        checkBoxF =  findViewById(R.id.French)
        checkBoxE =  findViewById(R.id.English)
        checkBoxM = findViewById(R.id.Music)
        checkBoxS =  findViewById(R.id.Sport)
        checkBoG =  findViewById(R.id.Games)
        btnSubmit = findViewById(R.id.Submit)
        name = intent.getStringExtra(NAME).toString()
        EMAIL = intent.getStringExtra(EMAIL).toString()
        AGE = intent.getStringExtra(AGE).toString()
        fun checkAnswer(): Boolean{

            if(checkBoxA!!.isChecked || checkBoxF!!.isChecked||checkBoxE!!.isChecked||checkBoxM!!.isChecked ||checkBoxS!!.isChecked ||checkBoG!!.isChecked){
                return true
            } else
                Toast.makeText(this,"Verife votre  ",Toast.LENGTH_LONG).show();
                 return false

        }
            btnSubmit!!.setOnClickListener {
                if (checkAnswer()){
                    val intent = Intent(this@MainActivity3, SuccessActivity::class.java).apply {
                        putExtra(NAME, name)
                        putExtra(EMAIL, EMAIL)
                        putExtra(AGE, AGE)
                    }

                    startActivity(intent)
                }
            }


        }
}
