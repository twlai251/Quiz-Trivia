package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import eu.tutorials.quizapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart:Button = findViewById(R.id.buttonStart)
        val etName: AppCompatEditText = findViewById(R.id.et_name)
        buttonStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)

                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}