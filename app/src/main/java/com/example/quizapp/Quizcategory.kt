package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_quizcategory.*

class Quizcategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizcategory)






        education.setOnClickListener {
            val intent =  Intent(this,Quizquestion1::class.java)
                startActivity(intent)
                finish()
        }
        tech.setOnClickListener {
            val intent =  Intent(this,Quizquestion2::class.java)

            startActivity(intent)
            finish()
        }
        phone.setOnClickListener {
            val intent =  Intent(this,Quizquestion3::class.java)

            startActivity(intent)
            finish()
        }

        sports.setOnClickListener {
            val intent =  Intent(this,Quizquestion4::class.java)

            startActivity(intent)
            finish()
        }
    }
}