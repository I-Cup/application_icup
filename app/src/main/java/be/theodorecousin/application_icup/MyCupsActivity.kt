package be.theodorecousin.application_icup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import be.theodorecousin.application_icup.fragments.CupsFragment

open class MyCupsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cups)

        findViewById<Button>(R.id.menu_return_button).setOnClickListener {
            onBackPressed()
        }

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.cups_container, CupsFragment(this))
        transaction.addToBackStack(null)
        transaction.commit()

    }

}