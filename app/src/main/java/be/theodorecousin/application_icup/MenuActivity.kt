package be.theodorecousin.application_icup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        findViewById<Button>(R.id.settings_button).setOnClickListener {
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.my_cups_button).setOnClickListener {
            val intent = Intent(this,MyCupsActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.info_button).setOnClickListener {
            val intent = Intent(this,InfoActivity::class.java)
            startActivity(intent)
        }

    }

}