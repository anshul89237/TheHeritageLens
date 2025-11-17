// file: NearbyMonumentsActivity.kt
package com.example.heritagelens

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

//import com.google.android.gms.location.FusedLocationProviderClient
//import com.google.android.gms.location.LocationServices

class NearbyMonumentsActivity : AppCompatActivity() {

//    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var recyclerView: RecyclerView
    private lateinit var monumentAdapter: NearbyMonumentsAdapter
    private lateinit var allMonuments: List<NearbyMonument>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nearby_monuments)

//        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        recyclerView = findViewById(R.id.nearbyRecyclerView)

        allMonuments = listOf(
            NearbyMonument("Taj Mahal", R.drawable.taj_mahal, "Agra, India", 27.1751, 78.0421,),
            NearbyMonument("Qutub Minar", R.drawable.qutub_minar, "Delhi, India", 28.5244, 77.1855,),
            NearbyMonument(
                "Gateway of India",
                R.drawable.gateway_of_india,
                "Mumbai, India",
                18.9218,
                72.8347),
            NearbyMonument("Charminar", R.drawable.charminar, "Hyderabad, India", 17.3616, 78.4747,),
            NearbyMonument(
                "Golden Temple",
                R.drawable.golden_temple,
                "Amritsar, India",
                31.6189,
                74.8883,
            ),
            NearbyMonument("Red Fort", R.drawable.red_fort, "Delhi, India", 28.6517, 77.2310,),
            NearbyMonument("Hawa Mahal", R.drawable.hawa_mahal, "Jaipur, India", 26.9219, 75.7944,),
            NearbyMonument(
                "Victoria Memorial",
                R.drawable.victoria_memorial,
                "Kolkata, India",
                22.5596,
                88.3419,
            )
//        NearbyMonument("Lotus Temple", R.drawable.lotus_temple, "Delhi, India", 28.5599, 77.2470),

        )

        checkLocationPermission()
    }

    private fun checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                100
            )
        } else {
//            getUserLocation()
        }
    }

//    private fun getUserLocation() {
//        fusedLocationClient.lastLocation.addOnSuccessListener { location ->
//            location?.let {
//                val nearby = filterNearbyMonuments(it.latitude, it.longitude)
//                monumentAdapter = NearbyMonumentsAdapter(nearby)
//                recyclerView.adapter = monumentAdapter
//            }
//        }
//    }

    private fun filterNearbyMonuments(userLat: Double, userLon: Double): List<NearbyMonument> {
        return allMonuments.filter {
            val results = FloatArray(1)
            Location.distanceBetween(userLat, userLon, it.latitude, it.longitude, results)
            results[0] <= 50000 // Within 50 km
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 100 && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//            getUserLocation()
        } else {
            Toast.makeText(this, "Location permission required to find nearby monuments", Toast.LENGTH_SHORT).show()
        }
    }
}
