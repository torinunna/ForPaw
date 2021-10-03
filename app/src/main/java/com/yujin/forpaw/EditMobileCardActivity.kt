package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityEditMobilecardBinding

class EditMobileCardActivity : BaseActivity(){

    lateinit var binding : ActivityEditMobilecardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_mobilecard)
        setupEvents()
        setValues()
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_neutral ->
                    if (checked) {
                    }
                R.id.radio_unneutral ->
                    if (checked) {
                    }
            }
        }
    }


    override fun setValues() {



    }

    override fun setupEvents() {

    }



}