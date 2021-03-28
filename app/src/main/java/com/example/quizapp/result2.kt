package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class result2 : AppCompatActivity() {
    private var totalscore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)


        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        totalscore += correctAnswers



        tv_score.text = "Your Score is $correctAnswers  out of  $totalQuestions"


        btn_finish.setOnClickListener {
            startActivity(Intent(this, Quizcategory::class.java))
        }

    }
}