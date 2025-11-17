package com.example.heritagelens

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MonumentDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monument_detail)

        // Receiving data from Intent
        val name = intent.getStringExtra("monumentName")
        val location = intent.getStringExtra("monumentLocation")
        val description = intent.getStringExtra("monumentDescription")
        val imageResId = intent.getIntExtra("monumentImageResId", -1)

        // Binding views
        val imageView = findViewById<ImageView>(R.id.monumentImage)
        val nameView = findViewById<TextView>(R.id.monumentName)
        val locationView = findViewById<TextView>(R.id.monumentLocation)
        val descriptionView = findViewById<TextView>(R.id.monumentDescription)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val mobileInput = findViewById<EditText>(R.id.mobileInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val messageInput = findViewById<EditText>(R.id.messageInput)
        val descriptionInput = findViewById<EditText>(R.id.descriptionInput)

        val ratingCleanliness = findViewById<RatingBar>(R.id.ratingCleanliness)
        val ratingAmenities = findViewById<RatingBar>(R.id.ratingAmenities)
        val ratingStaff = findViewById<RatingBar>(R.id.ratingStaff)
        val ratingOverall = findViewById<RatingBar>(R.id.ratingOverall)

        val submitButton = findViewById<Button>(R.id.submitFeedbackButton)

        // Setting received values
        if (imageResId != -1) imageView.setImageResource(imageResId)
        nameView.text = name
        locationView.text = location
        descriptionView.text = description

        // Submit Feedback Handler (you can customize this)
        submitButton.setOnClickListener {
            val feedbackName = nameInput.text.toString()
            val feedbackMobile = mobileInput.text.toString()
            val feedbackEmail = emailInput.text.toString()
            val feedbackMessage = messageInput.text.toString()
            val feedbackDesc = descriptionInput.text.toString()

            val cleanliness = ratingCleanliness.rating
            val amenities = ratingAmenities.rating
            val staff = ratingStaff.rating
            val overall = ratingOverall.rating

            // Validate required fields (basic)
            if (feedbackName.isBlank() || feedbackEmail.isBlank() || feedbackMessage.isBlank() || feedbackDesc.isBlank()) {
                Toast.makeText(this, "Please fill all required fields.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // For now, just show a Toast (you can later send this to backend or Firebase)
            Toast.makeText(this, "Feedback submitted for $name!", Toast.LENGTH_LONG).show()

            // Optionally, clear the form
            nameInput.text.clear()
            mobileInput.text.clear()
            emailInput.text.clear()
            messageInput.text.clear()
            descriptionInput.text.clear()
            ratingCleanliness.rating = 0f
            ratingAmenities.rating = 0f
            ratingStaff.rating = 0f
            ratingOverall.rating = 0f
        }
    }
}
