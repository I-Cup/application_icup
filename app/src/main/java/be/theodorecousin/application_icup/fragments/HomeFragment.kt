package be.theodorecousin.application_icup.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import be.theodorecousin.application_icup.R

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): //se charge d'injecter le layout dans fragment_home

            View? {

        return inflater?.inflate(R.layout.fragment_home, container, false)

    }

}