package com.yujin.forpaw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityFindIdBinding

class FindIdActivity : BaseActivity() {

    lateinit var binding : ActivityFindIdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_find_id)
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}