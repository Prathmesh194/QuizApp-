package com.example.quizapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
    private lateinit var mauth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        mauth = FirebaseAuth.getInstance()
        val currentUser = mauth.currentUser

        //we are ow taking the name from firebase with this mail id
        name.text = currentUser?.displayName
        // Taking User profile picture from mail id
        Glide.with(this).load(currentUser?.photoUrl).into(profile_image);




        btn_back.setOnClickListener {
            val intent = Intent(this,entry::class.java)
            startActivity(intent)
            finish()
        }





    }


}
