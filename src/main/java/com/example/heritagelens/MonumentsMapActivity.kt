package com.example.heritagelens

//import android.content.res.Configuration
//import android.media.VolumeShaper
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.osmdroid.config.Configuration
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker

class MonumentsMapActivity : AppCompatActivity() {
    private val monuments = listOf(
        NearbyMonument("Taj Mahal", R.drawable.taj_mahal, "Agra, India", 27.1751, 78.0421,),
        NearbyMonument("Qutub Minar", R.drawable.qutub_minar, "Delhi, India", 28.5244, 77.1855,),
        NearbyMonument(
            "Gateway of India",
            R.drawable.gateway_of_india,
            "Mumbai, India",
            18.9218,
            72.8347,
        ),
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

    private lateinit var map: MapView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            Configuration.getInstance()
                .load(applicationContext, getSharedPreferences("osmdroid", MODE_PRIVATE))
            setContentView(R.layout.activity_monuments_map)

            map = findViewById(R.id.osmMap)
            map.setTileSource(TileSourceFactory.MAPNIK)
            map.setMultiTouchControls(true)

            val mapController = map.controller
            val indiaCenter = GeoPoint(20.5937, 78.9629)
            mapController.setZoom(5.5)
            mapController.setCenter(indiaCenter)

            for (monument in monuments) {
                val marker = Marker(map)
                marker.position = GeoPoint(monument.latitude, monument.longitude)
                marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
                marker.title = monument.name
                marker.snippet = monument.description
                marker.icon =
                    resources.getDrawable(monument.imageResId, null) // Optional: show icon
                map.overlays.add(marker)
            }
        }

    override fun onResume() {
        super.onResume()
        map.onResume()
    }

    override fun onPause() {
        super.onPause()
        map.onPause()
    }
}
