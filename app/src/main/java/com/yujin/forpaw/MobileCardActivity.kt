package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityMobilecardBinding

class MobileCardActivity : BaseActivity() {

    lateinit var binding : ActivityMobilecardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mobilecard)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.mCardEdtBtn.setOnClickListener {
            val mCardEdtIntent = Intent(mContext, EditMobileCardActivity::class.java)
            startActivity(mCardEdtIntent)
        }

        binding.backToMainBtn.setOnClickListener {
            val backToMainIntent = Intent(mContext, FriendMainActivity::class.java)
            startActivity(backToMainIntent)
9        }



    }

    override fun setValues() {

    }
}