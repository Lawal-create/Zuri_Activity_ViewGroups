package com.example.zuri_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SignIn()
    }



    fun SignIn(){
        var email:TextView=findViewById(R.id.emailAddress);
        var password:TextView=findViewById(R.id.password);
        var signIn:Button=findViewById(R.id.SignIn)

        //To sign into the ListViewActivity
        signIn.setOnClickListener(View.OnClickListener {
            if (email.text.toString()=="zuritraining@gmail.com" && password.text.toString()=="zuriisawesome"){
                var SignInIntent:Intent= Intent(this,ListViewActivity::class.java)
                startActivity(SignInIntent)
            }
        })

    }


}