package com.example.calculator.saksham.editz

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        instagram()
        linkedin()
        website()
        gmail()
        github()
    }
    private fun instagram(){
        val img = findViewById<View>(R.id.igb) as ImageView
        img.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.setData(Uri.parse("https://www.instagram.com/saksham_loona/"))
            startActivity(intent)
        }
    }
    private fun linkedin(){
        val img = findViewById<View>(R.id.linkb) as ImageView
        img.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.setData(Uri.parse("https://linkedin.com/in/saksham-loona-716248291/"))
            startActivity(intent)
        }
    }
    private fun website(){
        val img = findViewById<View>(R.id.webb) as ImageView
        img.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.setData(Uri.parse("https://sakshamloona9.wixsite.com/my-site/"))
            startActivity(intent)
        }
    }
    private fun gmail(){
        val img = findViewById<View>(R.id.gmailb) as ImageView
        img.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.setData(Uri.parse("mailto:sakshamloona9@gmail.com"))
            startActivity(intent)
        }
    }
    private fun github(){
        val img = findViewById<View>(R.id.githubb) as ImageView
        img.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.setData(Uri.parse("https://github.com/saksham-09-design"))
            startActivity(intent)
        }
    }
}