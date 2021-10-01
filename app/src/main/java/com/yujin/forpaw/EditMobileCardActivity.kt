package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
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


    override fun setValues() {



    }

    override fun setupEvents() {

    }



}