package be.theodorecousin.application_icup.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import be.theodorecousin.application_icup.AffondRepository
import be.theodorecousin.application_icup.AffondRepository.Singleton.affondList
import be.theodorecousin.application_icup.MainActivity
import be.theodorecousin.application_icup.R
import be.theodorecousin.application_icup.adapter.AffondAdapter

class HomeFragment(private val context: MainActivity) : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
    //se charge d'injecter le layout dans fragment_home

            View? {



        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //récupérer le recyclerview
        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.adapter = AffondAdapter(context, affondList, R.layout.item_vertical_chronos)

        return view

    }



}