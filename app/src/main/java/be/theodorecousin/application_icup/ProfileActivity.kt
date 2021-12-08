package be.theodorecousin.application_icup

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class ProfileActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

    }

    fun getSet(view: View){
        val editTxt = findViewById<EditText>(R.id.input_pseudo)
        val pseudo = editTxt.text.toString()
        if (ValidatePseudo(pseudo)) {
            val pseudo_current_page = findViewById<TextView>(R.id.ton_pseudo).apply {
                text = pseudo
            }
        }
    }

    //retourne true si le pseudo est valide, false sinon
    fun ValidatePseudo(string: String): Boolean {

        val current_pseudo = findViewById<EditText>(R.id.ton_pseudo).text.toString()
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