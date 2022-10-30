package com.example.curriculumvitaev2

import android.content.Intent
import android.icu.lang.UProperty.NAME
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isEmpty
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity2 : AppCompatActivity() {
     val NAME = "NAME"
    val EMAIL = "NAME"
    val AGE = "NAME"
//    private var checkBoxA : RadioButton? = null
//    private var checkBoxF : RadioButton? = null
//    private var checkBoxE : RadioButton? = null
//    private var btnSubmit : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val outlinedTextField =findViewById<TextInputEditText>(R.id.outlinedTextField) as TextInputLayout
        val outlinedTextField3 =findViewById<TextInputEditText>(R.id.AgeText) as TextInputLayout
        val outlinedTextField2 =findViewById<TextInputEditText>(R.id.outlinedTextField2) as TextInputLayout
    var name = outlinedTextField?.editText?.text!!.toString()
    var emailOu = outlinedTextField2?.editText?.text!!.toString()
    var AgeOU = outlinedTextField3?.editText?.text!!.toString()

//        checkBoxA = findViewById(R.id.Arabic)
//        checkBoxF =  findViewById(R.id.French)
//        checkBoxE =  findViewById(R.id.English)

        val  txtName = findViewById(R.id.name) as TextView
        val  txtEmail = findViewById(R.id.Email) as TextView
        val  txtv5 = findViewById(R.id.AgeV) as TextView

        val btnClick = findViewById(R.id.next) as Button
//        btnSubmit = findViewById(R.id.Submit)
//        fun checkAnswer(): Boolean{
//
//            if(checkBoxA!!.isChecked && checkBoxF!!.isChecked&&checkBoxE!!.isChecked){
//                    return true
//                } else
//                    return false;
//            btnSubmit!!.setOnClickListener {
//                if (checkAnswer()){
//                    val intent = Intent(this@MainActivity2, SuccessActivity::class.java).apply {
//
//                    }
//
//                    startActivity(intent)
//                }
//            }
//

        btnClick.setOnClickListener {
            if (outlinedTextField?.editText?.text!!.isEmpty())
       {
           txtName?.setText("must not be empty")
           outlinedTextField?.error = "dsghbf"
           txtEmail?.setText("")
           txtv5?.setText("")

       }
       else if (outlinedTextField2?.editText?.text!!.isEmpty())
        {

            txtEmail?.setText("must not be empty")
            outlinedTextField2?.error = "dsghbf"
            txtName?.setText("")
            txtv5?.setText("")
        }
        if (outlinedTextField3?.editText?.text!!.isEmpty())
        {
            txtv5?.setText("must not be empty")
            outlinedTextField3?.error = "rffr"
            txtName?.setText("")
            txtEmail?.setText("")

        } else{
            if (outlinedTextField3.editText?.text!!.toString()!=""||outlinedTextField2.editText?.text!!.toString()!="" ||outlinedTextField.editText?.text!!.toString()!=""){
                val intent = Intent(this@MainActivity2, MainActivity3::class.java).apply {
                    putExtra(NAME, name)
                    putExtra(EMAIL, emailOu)
                    putExtra(AGE, AgeOU)

                }

                startActivity(intent)
            }
            }

        }

            }


    }




