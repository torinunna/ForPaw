package com.yujin.forpaw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityFindPwdBinding

class FindPwdActivity : BaseActivity() {

    lateinit var binding : ActivityFindPwdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_find_pwd)
    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }
}