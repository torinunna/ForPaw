package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityLoginBinding

abstract class LoginActivity : BaseActivity() {

    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.signInBtn.setOnClickListener {
            val signinIntent = Intent(mContext, MainActivity::class.java)
            startActivity(signinIntent)

        }


            binding.signUpBtn.setOnClickListener {
                val signupIntent = Intent(mContext, SignUpActivity::class.java )
                startActivity(signupIntent)

            }


    }

    override fun setValues() {
    }


}