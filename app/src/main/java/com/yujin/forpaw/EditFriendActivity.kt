package com.yujin.forpaw

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityEditFriendBinding

class EditFriendActivity : BaseActivity() {

    lateinit var binding: ActivityEditFriendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_friend)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.OkBtn.setOnClickListener {

        }
    }

    override fun setValues() {
    }
}