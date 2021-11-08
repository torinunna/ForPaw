package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.AdapterViewBindingAdapter
import com.yujin.forpaw.adapters.FriendAdapter
import com.yujin.forpaw.databinding.ActivityMainBinding
import com.yujin.forpaw.databinding.FriendListItemBinding
import com.yujin.forpaw.datas.FriendData

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        binding.addFriendBtn.setOnClickListener {
            val addFriendIntent = Intent(mContext, AddFriendActivity::class.java)
            startActivity(addFriendIntent)
        }
    }

        override fun setValues() {
        }

}