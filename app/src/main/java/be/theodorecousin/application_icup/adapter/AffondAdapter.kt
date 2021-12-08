package be.theodorecousin.application_icup.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import be.theodorecousin.application_icup.AffondModel
import be.theodorecousin.application_icup.AffondRepository.Singleton.affondList
import be.theodorecousin.application_icup.MainActivity
import be.theodorecousin.application_icup.R
import org.w3c.dom.Text

class AffondAdapter(private val context : MainActivity,
                    private val affondList: List<AffondModel>,
                    private val layoutID: Int
                    ) : RecyclerView.Adapter<AffondAdapter.ViewHolder>(){

    //layout qui gere tous les éléments à contrôler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val affondTemps:TextView? = view.findViewById(R.id.chrono_affon)
        val affondHeure:TextView? = view.findViewById(R.id.heure_affon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(layoutID, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //infos de l'affond
        val currentAffond = affondList[position]

        holder.affondHeure?.text = currentAffond.heure
        holder.affondTemps?.text = currentAffond.temps


    }

    override fun getItemCount(): Int = affondList.size
}