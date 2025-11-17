package com.example.heritagelens

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UploadMonumentActivity : AppCompatActivity() {

    private lateinit var imgViews: Array<ImageView>
    private val imageUris = arrayOfNulls<Uri>(3)
    private val IMAGE_PICK_CODE = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_monument)

        imgViews = arrayOf(
            findViewById(R.id.img1),
            findViewById(R.id.img2),
            findViewById(R.id.img3)
        )

        imgViews.forEachIndexed { index, imageView ->
            imageView.setOnClickListener {
                pickImage(index)
            }
        }

        findViewById<Button>(R.id.btnSubmit).setOnClickListener {
            if (validateForm()) {
                // Call your OTP logic and submit to DB
                Toast.makeText(this, "OTP Sent & Monument Uploaded", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btnMarkLocation).setOnClickListener {
            // Optionally get GPS coordinates here
            Toast.makeText(this, "Location Marked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun pickImage(index: Int) {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, IMAGE_PICK_CODE + index)
    }

    @Deprecated("This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && data != null) {
            val index = requestCode - IMAGE_PICK_CODE
            val imageUri = data.data
            imageUris[index] = imageUri
            imgViews[index].setImageURI(imageUri)
        }
    }

    private fun validateForm(): Boolean {
        val name = findViewById<EditText>(R.id.etMonumentName).text.toString().trim()
        val desc = findViewById<EditText>(R.id.etDescription).text.toString().trim()
        val mobile = findViewById<EditText>(R.id.etMobile).text.toString().trim()
        val termsChecked = findViewById<CheckBox>(R.id.cbTerms).isChecked

        return when {
            name.isEmpty() || desc.isEmpty() || mobile.length != 10 -> {
                Toast.makeText(this, "Fill required fields properly", Toast.LENGTH_SHORT).show()
                false
            }
            !termsChecked -> {
                Toast.makeText(this, "Accept Terms & Conditions", Toast.LENGTH_SHORT).show()
                false
            }
            else -> true
        }
    }
}
