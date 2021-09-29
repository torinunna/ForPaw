package com.yujin.forpaw

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivitySignupBinding

class SignUpActivity : BaseActivity() {

    lateinit var binding : ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}