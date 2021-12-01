package be.theodorecousin.application_icup.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import be.theodorecousin.application_icup.R

class AffondAdapter : RecyclerView.Adapter<AffondAdapter.ViewHolder>(){

    //layout qui gere tous les éléments à contrôler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        //récupérer la box en question

        //box_item est une variable venant du fichier item_vertical_affond.xml
        //il s'agit de l'élément générique que nous allons injecter dans notre linear layout dynamic
        val affondBox = view.findViewById<FrameLayout>(R.id.box_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_vertical_affond, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

    override fun getItemCount(): Int {
        return 5
    }

}