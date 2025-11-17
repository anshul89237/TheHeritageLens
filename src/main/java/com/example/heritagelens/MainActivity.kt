package com.example.heritagelens

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {
    private lateinit var browseMonumentsCard: CardView
    private lateinit var nearbyMonumentsCard: CardView
    private lateinit var uploadMonumentCard: CardView
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        FirebaseApp.initializeApp(this)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)
//        supportActionBar?.title = "Heritage Lens"

        // Initialize CardViews
        browseMonumentsCard = findViewById(R.id.browse_monuments_card)
        nearbyMonumentsCard = findViewById(R.id.nearby_monuments_card)
        uploadMonumentCard = findViewById(R.id.upload_monument_card)

        // Set click listeners with intents
        browseMonumentsCard.setOnClickListener {
            val intent = Intent(this, BrowseMonumentsActivity::class.java)
            startActivity(intent)
        }

        nearbyMonumentsCard.setOnClickListener {
            val intent = Intent(this, NearbyMonumentsActivity::class.java)
            startActivity(intent)
        }

        uploadMonumentCard.setOnClickListener {
            val intent = Intent(this, UploadMonumentActivity::class.java)
            startActivity(intent)
        }

        // Optional welcome toast
        val footerText: TextView = findViewById(R.id.footer_text)
        footerText.setOnClickListener {
            Toast.makeText(this, "Thank you for using Heritage Lens!", Toast.LENGTH_SHORT).show()
        }
    }
}