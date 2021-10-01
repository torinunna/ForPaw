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

    val mFriendList = ArrayList<FriendData>()

    lateinit var mAdapter: FriendAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setupEvents()
        setValues()

        mFriendList.add(FriendData("권토리", 2016))
        mFriendList.add(FriendData("권베베", 2019))

        mAdapter = FriendAdapter(this, R.layout.friend_list_item, mFriendList)

        binding.friendListView.adapter = mAdapter


        binding.friendListView.setOnItemClickListener { adapterView, view, i, l ->

            val friendMainIntent = Intent(mContext, FriendMainActivity::class.java)
            startActivity((friendMainIntent))
        }


    }


    override fun setupEvents() {


        binding.addFriendBtn.setOnClickListener {
            val addfriendIntent = Intent(mContext, AddFriendActivity::class.java)
            startActivity(addfriendIntent) }






    }

        override fun setValues() {
        }

}

