package be.theodorecousin.application_icup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import be.theodorecousin.application_icup.databinding.ActivityProfileBinding
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

    }

    fun getSet(view: View){
        val editTxt = findViewById<EditText>(R.id.input_pseudo)
        val msg = editTxt.text.toString()
        if (ValidatePseudo(msg)) {
            val txtView = findViewById<TextView>(R.id.ton_pseudo).apply {
                text = msg
            }
        }
    }

    //retourne true si le pseudo est valide, false sinon
    fun ValidatePseudo(string: String): Boolean {
        if (string.isEmpty()) {
            toast("Attention: pseudo vide!")
            return false
        }
        else if (string.length < 4) {
            toast("Attention: pseudo trop court!")
            return false
        }
        else if (string.filterNot { it.isWhitespace()}.length < 4) {
            toast("Attention: nombre de caractères valides trop faible!")
            return false
        }
        else if (string.length > 16) {
            toast("Attention: pseudo trop long!")
            return false
        }
        else {
            toast("Pseudo modifié avec succès!")
            return true
        }
    }

    fun toast(string: String){
        Toast.makeText(applicationContext, string, Toast.LENGTH_SHORT).show()
    }


}