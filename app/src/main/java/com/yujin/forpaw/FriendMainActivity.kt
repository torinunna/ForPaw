package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityFriendMainBinding

class FriendMainActivity : BaseActivity() {

    lateinit var binding: ActivityFriendMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_friend_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.backToMainBtn.setOnClickListener {

            val backtomainIntent = Intent(mContext, MainActivity::class.java)

        }
    }



    override fun setValues() {
    }
}