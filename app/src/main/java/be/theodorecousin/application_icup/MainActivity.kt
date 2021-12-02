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

        //injecte le linear layout affichant les chrono dans le container prévu à cet effet
        transaction.replace(R.id.chrono_container, HomeFragment())

        //injecte la top bar dans le container prévu à cet effet
        transaction.replace(R.id.top_bar_container,TopFragment())

        //injecte la task bar dans le container prévu à cet effet
        transaction.replace(R.id.bottom_bar_container,BottomFragment())

        //valider les changements
        transaction.addToBackStack(null)
        transaction.commit()

    }
}