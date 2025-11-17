package com.example.heritagelens

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.google.firebase.auth.FirebaseAuth

class SignUpPage : AppCompatActivity() {

//    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_page)

//        auth = FirebaseAuth.getInstance()

        val nameEditText = findViewById<EditText>(R.id.full_name)
        val emailEditText = findViewById<EditText>(R.id.signup_email)
        val passwordEditText = findViewById<EditText>(R.id.signup_password)
        val confirmPasswordEditText = findViewById<EditText>(R.id.signup_confirm_password)
        val signUpButton = findViewById<Button>(R.id.btn_sign_up)
        val loginTextView = findViewById<TextView>(R.id.already_have_account)


        signUpButton.setOnClickListener()
        {
            val name = nameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val confirmPassword = confirmPasswordEditText.text.toString().trim()


            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Sign up successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, LoginPage::class.java)
                startActivity(intent)
                finish()
            }
        }

        loginTextView.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
            finish()
        }
    }
}