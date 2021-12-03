package be.theodorecousin.application_icup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import be.theodorecousin.application_icup.adapter.AffondAdapter
import be.theodorecousin.application_icup.fragments.HistoryFragment
import be.theodorecousin.application_icup.fragments.HomeFragment
import be.theodorecousin.application_icup.fragments.StatsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //importer la bottomnavigationview
        loadFragment(HomeFragment(this))



        val navigationView = findViewById<BottomNavigationView>(R.id.navigation_view)

        navigationView.setOnNavigationItemSelectedListener {
            when(it.itemId)
            {
                R.id.home_page -> {
                    loadFragment(HomeFragment(this))
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.history_page -> {
                    loadFragment(HistoryFragment(this))
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.stats_page -> {
                    loadFragment(StatsFragment(this))
                    return@setOnNavigationItemSelectedListener true
                }
                else->false
            }
        }

        findViewById<Button>(R.id.menu_button).setOnClickListener {
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        }



    }

    private fun loadFragment(fragment: Fragment) {


        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}