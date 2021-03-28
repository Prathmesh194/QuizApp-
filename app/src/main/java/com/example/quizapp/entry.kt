package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_entry.*


class entry : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)

        var auth = FirebaseAuth.getInstance()



        sign_out_btn.setOnClickListener {
           auth.signOut()
            val intent = Intent(this, LoginActivity ::class.java)
            startActivity(intent)
            finish()
        }


        btn_start.setOnClickListener {
                val intent = Intent(this,Quizcategory::class.java)
                startActivity(intent)
                finish()

        }
        ic_profile.setOnClickListener {
            val intent = Intent(this,Profile::class.java)
            startActivity(intent)
            finish()
        }



        }



    fun quitApp(view: View) {
        exitProcess()
    }
    private fun exitProcess(){
        kotlin.system.exitProcess(-1)
    }

}



