package be.theodorecousin.application_icup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import be.theodorecousin.application_icup.fragments.BottomFragment
import be.theodorecousin.application_icup.fragments.HomeFragment
import be.theodorecousin.application_icup.fragments.TopFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injecter le fragment dans fragment_container

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.chrono_container, HomeFragment())
        transaction.replace(R.id.top_bar_container,TopFragment())
        transaction.replace(R.id.bottom_bar_container,BottomFragment())
        transaction.addToBackStack(null)
        transaction.commit()

    }
}