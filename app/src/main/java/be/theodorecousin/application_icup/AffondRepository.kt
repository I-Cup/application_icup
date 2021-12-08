package be.theodorecousin.application_icup

import be.theodorecousin.application_icup.AffondRepository.Singleton.affondList
import be.theodorecousin.application_icup.AffondRepository.Singleton.databaseref
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class AffondRepository {

    object Singleton{
        //se connnecter à la ref "User"
        val databaseref = FirebaseDatabase.getInstance().getReference("Affonds")

        //créer une variable qui va contenir le username
        val affondList = arrayListOf<AffondModel>()
    }

    fun updateData(){

        //data provenant de databaseref => username
        databaseref.addValueEventListener(object: ValueEventListener{

            override fun onDataChange(p0: DataSnapshot) {

                //retirer les anciens affonds
                affondList.clear()

                //récolter la liste
                for (ds in p0.children){
                  val affond = ds.getValue(AffondModel::class.java)

                  //vérif que l'affond n'est pas égal a null
                  if (affond != null){
                      affondList.add(affond)
                  }
                }
            }

            override fun onCancelled(p0: DatabaseError) {}
        })

    }


}