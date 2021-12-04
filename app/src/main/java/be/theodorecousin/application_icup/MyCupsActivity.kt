package be.theodorecousin.application_icup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import be.theodorecousin.application_icup.fragments.CupsFragment

open class MyCupsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cups)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.cups_container, CupsFragment(this))
        transaction.addToBackStack(null)
        transaction.commit()

    }

}