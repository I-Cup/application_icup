package be.theodorecousin.application_icup

import android.app.Dialog
import android.os.Bundle
import android.view.Window
import be.theodorecousin.application_icup.adapter.AffondAdapter

class SettingsPopup(private val adapter: AffondAdapter) : Dialog(adapter.context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.popup_settings)
    }

}