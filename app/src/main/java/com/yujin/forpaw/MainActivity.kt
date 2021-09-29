package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.addFriendBtn.setOnClickListener {
            val addfriendIntent = Intent(mContext, AddFriendActivity::class.java)
            startActivity(addfriendIntent)

        }
    }

    override fun setValues() {
    }

}