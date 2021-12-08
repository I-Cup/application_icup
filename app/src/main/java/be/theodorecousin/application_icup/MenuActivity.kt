package be.theodorecousin.application_icup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MenuActivity : AppCompatActivity() {

    var receiver_msg: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        findViewById<Button>(R.id.menu_return_button).setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

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

        findViewById<Button>(R.id.profile_button).setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        receiver_msg = findViewById<View>(R.id.username) as TextView

        val intent = intent
        val str = intent.getStringExtra("message_key")
        receiver_msg!!.text = str


    }

}