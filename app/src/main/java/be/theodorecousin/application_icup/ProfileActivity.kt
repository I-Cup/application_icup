package be.theodorecousin.application_icup

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class ProfileActivity : AppCompatActivity() {

    var send_button: Button? = null
    var send_text: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun getSet(view: View){

        send_button = findViewById<View>(R.id.button_submit) as Button
        send_text = findViewById<View>(R.id.input_pseudo) as EditText

        val str = send_text!!.text.toString()

        if (ValidatePseudo(str)) {
            val intent = Intent(applicationContext, MenuActivity::class.java)
            intent.putExtra("message_key", str)
            startActivity(intent)
        }
    }

    //retourne true si le pseudo est valide, false sinon
    fun ValidatePseudo(string: String): Boolean {

        val current_pseudo = intent.getStringExtra("message_key")
        var validated = false
        var message = "Erreur inconnue"


        if (string.isEmpty()) {message = "Attention: pseudo vide!"}

        else if (string.length < 4) {message = "Attention: pseudo trop court!"}

        else if (string.filterNot { it.isWhitespace()}.length < 4) { message = "Attention: nombre de caractères valides trop faible!"}

        else if (string.length > 16) {message ="Attention: pseudo trop long!"}

        else if (string == current_pseudo){message = "Attention: pseudo identique!"}

        else {
            message = "Pseudo modifié avec succès!"
            validated = true
            toast(message)
        }

        val message_box = findViewById<TextView>(R.id.message).apply {
            text = message
        }

        //toast(message)
        return validated
    }

    fun toast(string: String){
        Toast.makeText(applicationContext, string, Toast.LENGTH_SHORT).show()
    }
}