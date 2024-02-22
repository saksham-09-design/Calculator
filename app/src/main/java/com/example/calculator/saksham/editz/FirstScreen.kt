package com.example.calculator.saksham.editz

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class FirstScreen: AppCompatActivity(){
    @SuppressLint("MissingInflatedId")
    override fun  onCreate(savedIntenceState: Bundle?){
        super.onCreate(savedIntenceState)
        setContentView(R.layout.first_screen)
        val icon1: ImageView = findViewById(R.id.icon)
        val animation: Animation = AnimationUtils.loadAnimation(this, com.google.android.material.R.anim.abc_slide_in_bottom)
        icon1.startAnimation(animation)
        val text1: TextView = findViewById(R.id.calculation_made_easy)
        val animation1: Animation = AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_slide_in_bottom)
        text1.startAnimation(animation1)
        val text2: TextView = findViewById(R.id.saksham)
        val animation2: Animation = AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_slide_in_bottom)
        text2.startAnimation(animation2)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },1000)
    }
}