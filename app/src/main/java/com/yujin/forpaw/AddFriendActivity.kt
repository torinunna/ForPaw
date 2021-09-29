package com.yujin.forpaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityAddFriendBinding

class AddFriendActivity : BaseActivity() {

    lateinit var binding : ActivityAddFriendBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_friend)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.mCardBtn.setOnClickListener{

            val mcardIntent = Intent(mContext, EditMobileCardActivity::class.java)
        }

        binding.OKBtn.setOnClickListener{

            val okIntent = Intent(mContext, MainActivity::class.java)
        }

    }

    override fun setValues() {

    }
}