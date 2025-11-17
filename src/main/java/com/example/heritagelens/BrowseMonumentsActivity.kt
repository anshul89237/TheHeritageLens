//package com.example.heritagelens
//
//import android.os.Bundle
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import androidx.recyclerview.widget.GridLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//class BrowseMonumentsActivity : AppCompatActivity() {
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var adapter: MonumentsAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_browse_monuments)
////        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.browse)) { v, insets ->
////            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
////            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
////            insets
////        }
//        recyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
////
////        val monuments = listOf(
////            Monument("The Colosseum - Rome",R.drawable.colosseum),
////            Monument("Petra - Jordan", R.drawable.petra),
////            Monument("Taj Mahal - Agra", R.drawable.taj_mahal),
////            Monument("Great Wall of China - China", R.drawable.great_wall_of_china),
////            Monument("Christ The Redeemer - Rio de Janeiro", R.drawable.christ_the_redeemer),
////            Monument("Machu Picchu - Peru", R.drawable.machu_picchu),
////            Monument("Chichen Itza - Mexico", R.drawable.chichen_itza),
////            Monument("Ananta Sayi Vishnu - Dhenkanal", R.drawable.monument1),
////            Monument("Athirala Parasurama temple - Y.S.R.", R.drawable.monument2),
////            Monument("Church and Convent of St. Francis of Assisi - North Goa", R.drawable.monument3),
////            Monument("Dolotsava mandapa, Mamallapuram - Chengalpattu", R.drawable.monument4),
////            Monument("Eight stone images on a masonry Platform known as the Seven pidaris - Mamallapuram", R.drawable.monument5),
////            Monument("Fatehpur Sikri Group of Monuments - Agra", R.drawable.monument6),
////            Monument("Mahishasura rock standing in the sea to the north of the Shore Temple - Mamallapuram", R.drawable.monument7),
////            Monument("Mukundanayanar Temple (half buried in sand to the north of the village) - Mamallapuram", R.drawable.monument8),
////            Monument("Rajaji Hills - Mysore", R.drawable.monument9),
////            Monument("Sri Krishna Temple - Tirupati", R.drawable.monument10),
////
////        )
//        val monuments = listOf(
//            Monument(
//                name = "Taj Mahal",
//                imageResId = R.drawable.taj_mahal,
//                location = "Agra, Uttar Pradesh, India",
//                description = "A white marble mausoleum built in 1632 by Mughal emperor Shah Jahan in memory of his beloved wife Mumtaz Mahal. It's a UNESCO World Heritage Site and a symbol of eternal love."
//            ),
//            Monument(
//                name = "Charminar",
//                imageResId = R.drawable.charminar,
//                location = "Hyderabad, Telangana, India",
//                description = "An iconic 16th-century mosque with four grand arches and minarets, built by Muhammad Quli Qutb Shah. It represents Indo-Islamic architecture with Persian influences."
//            ),
//            Monument(
//                name = "Qutub Minar",
//                imageResId = R.drawable.qutubminar,
//                location = "Delhi, India",
//                description = "This 73-meter tall minaret was constructed in 1193 by Qutb-ud-din Aibak. Made of red sandstone and marble, it is the tallest brick minaret in the world and a UNESCO World Heritage Site."
//            ),
//            Monument(
//                name = "Gateway of India",
//                imageResId = R.drawable.gatewayofindia,
//                location = "Mumbai, Maharashtra, India",
//                description = "Built in 1924, this basalt arch-monument commemorates the landing of King George V in India. It's a major tourist attraction and a symbol of Mumbai."
//            ),
//            Monument(
//                name = "Red Fort",
//                imageResId = R.drawable.redfort,
//                location = "Delhi, India",
//                description = "Constructed in 1639 by Shah Jahan, the Red Fort served as the main residence of Mughal emperors. It showcases Indo-Islamic, Mughal, and Persian architecture."
//            ),
//            Monument(
//                name = "Hawa Mahal",
//                imageResId = R.drawable.hawamahal,
//                location = "Jaipur, Rajasthan, India",
//                description = "Known as the 'Palace of Winds,' this five-storey pink sandstone structure with 953 small windows was built in 1799 to allow royal women to observe street festivals unseen."
//            ),
//            Monument(
//                name = "Sun Temple",
//                imageResId = R.drawable.suryatemple,
//                location = "Konark, Odisha, India",
//                description = "A 13th-century temple dedicated to the Sun God Surya, known for its chariot-shaped structure with intricately carved stone wheels and horses."
//            ),
//            Monument(
//                name = "Mysore Palace",
//                imageResId = R.drawable.mysorepalace,
//                location = "Mysuru, Karnataka, India",
//                description = "A historical palace and royal residence of the Wadiyar dynasty, known for its Indo-Saracenic architecture and grand Dussehra celebrations."
//            ),
//            Monument(
//                name = "India Gate",
//                imageResId = R.drawable.indiagate,
//                location = "New Delhi, India",
//                description = "A 42-meter tall war memorial built in 1931 to honor Indian soldiers who died during World War I. It stands as a national symbol of sacrifice."
//            ),
//            Monument(
//                name = "Golden Temple",
//                imageResId = R.drawable.goldentemple,
//                location = "Amritsar, Punjab, India",
//                description = "Also known as Harmandir Sahib, it is the most sacred Gurdwara in Sikhism, renowned for its gold-covered sanctum and surrounding Amrit Sarovar (holy tank)."
//            ),
//            Monument(
//                name = "Meenakshi Temple",
//                imageResId = R.drawable.meenakshitemple,
//                location = "Madurai, Tamil Nadu, India",
//                description = "An ancient temple dedicated to Goddess Meenakshi and Lord Sundareswarar, famous for its towering gopurams (gateway towers) and intricate carvings."
//            ),
//            Monument(
//                name = "Victoria Memorial",
//                imageResId = R.drawable.victoriamemorial,
//                location = "Kolkata, West Bengal, India",
//                description = "A white marble museum and monument built in honor of Queen Victoria. It blends British and Mughal architectural styles and houses colonial-era exhibits."
//            )
//        )
//
//
//        adapter = MonumentsAdapter(monuments)
//        recyclerView.adapter = adapter
//    }
//
//
//}
package com.example.heritagelens

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BrowseMonumentsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var monumentList: List<Monument>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse_monuments)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        // 7 Monuments Sample Data (You can replace with real monument data)
        monumentList = listOf(
            Monument("Taj Mahal", "Agra, India", "A white marble mausoleum built by Mughal emperor Shah Jahan.", R.drawable.taj_mahal),
            Monument("Eiffel Tower", "Paris, France", "An iconic iron tower and symbol of France.", R.drawable.eiffel_tower),
            Monument("Great Wall", "China", "Ancient wall built for protection during Chinese empires.", R.drawable.great_wall),
            Monument("Colosseum", "Rome, Italy", "A Roman amphitheater known for gladiator battles.", R.drawable.colosseum),
            Monument("Petra", "Jordan", "Rock-cut architecture and water conduit system of ancient Nabataeans.", R.drawable.petra),
            Monument("Machu Picchu", "Peru", "An Incan citadel set high in the Andes Mountains.", R.drawable.machu_picchu),
            Monument("Statue of Liberty", "New York, USA", "A symbol of freedom gifted by France.", R.drawable.statue_of_liberty),
            Monument("Charminar", "Hyderabad,India", "An iconic 16th-century mosque with four grand arches and minarets, built by Muhammad Quli Qutb Shah. It represents Indo-Islamic architecture with Persian influences.", R.drawable.charminar),
            Monument("Qutub Minar", "Delhi, India", "This 73-meter tall minaret was constructed in 1193 by Qutb-ud-din Aibak. Made of red sandstone and marble, it is the tallest brick minaret in the world and a UNESCO.",R.drawable.qutub_minar),
            Monument("Gateway of India", "Mumbai, Maharashtra, India", "Built in 1924, this basalt arch-monument commemorates the landing of King George V in India. It's a major tourist attraction and a symbol of Mumbai.",R.drawable.gateway_of_india),
            Monument("Red Fort", "Delhi, India", "Constructed in 1639 by Shah Jahan, the Red Fort served as the main residence of Mughal emperors. It showcases Indo-Islamic, Mughal, and Persian architecture.",R.drawable.red_fort),
            Monument("Hawa Mahal", "Jaipur, Rajasthan, India", "Known as the 'Palace of Winds,' this five-storey pink sandstone structure with 953 small windows was built in 1799 to allow royal women to observe street festivals unseen.",R.drawable.hawa_mahal),
            Monument("Sun Temple", "Konark, Odisha, India", "A 13th-century temple dedicated to the Sun God Surya, known for its chariot-shaped structure with intricately carved stone wheels and horses.",R.drawable.sun_temple),
            Monument("Mysore Palace", "Mysuru, Karnataka, India", "A historical palace and royal residence of the Wadiyar dynasty, known for its Indo-Saracenic architecture and grand Dussehra celebrations.",R.drawable.mysore_palace),
            Monument("Golden Temple", "Amritsar, Punjab, India", "Also known as Harmandir Sahib, it is the most sacred Gurdwara in Sikhism, renowned for its gold-covered sanctum and surrounding Amrit Sarovar (holy tank).",R.drawable.golden_temple),
            Monument("Meenakshi Temple", "Madurai, Tamil Nadu, India", "An ancient temple dedicated to Goddess Meenakshi and Lord Sundareswarar, famous for its towering gopurams (gateway towers) and intricate carvings.",R.drawable.meenakshi_temple),
            Monument("Victoria Memorial", "Kolkata, West Bengal, India", "A white marble museum and monument built in honor of Queen Victoria. It blends British and Mughal architectural styles and houses colonial-era exhibits.",R.drawable.victoria_memorial),
            Monument("Chichen Itza", "Mexico", "Ancient Mayan city with pyramids, temples, and astronomical observations.", R.drawable.chichen_itza),
            Monument("Angkor Wat", "Cambodia", "Famous temple complex carved into mountains.", R.drawable.angkor_wat),
            Monument("Stonehenge", "England", "Ancient stone circle believed to be a temple.", R.drawable.stonehenge)
        )

        val adapter = MonumentsAdapter(monumentList) { monument ->
            val intent = Intent(this, MonumentDetailsActivity::class.java).apply {
                putExtra("monumentName", monument.name)
                putExtra("monumentLocation", monument.location)
                putExtra("monumentDescription", monument.description)
                putExtra("monumentImageResId", monument.imageResId)
            }
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}
