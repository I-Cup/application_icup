package be.theodorecousin.application_icup.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import be.theodorecousin.application_icup.MainActivity
import be.theodorecousin.application_icup.R

class HistoryFragment(private val context: MainActivity) : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_historique, container, false)

        return view
    }
}