package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.applandeo.materialcalendarview.EventDay
import com.yujin.forpaw.databinding.ActivityVetClinicBinding
import java.util.*


class VetClinicActivity : BaseActivity() {

    lateinit var binding : ActivityVetClinicBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_vet_clinic)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

        binding.addBookingBtn.setOnClickListener {

            val addBookingIntent = Intent(mContext, AddBookingActivity::class.java)
            startActivity(addBookingIntent)
        }

    }

    override fun setValues() {
    }

}

