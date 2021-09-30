package com.yujin.forpaw

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {

    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        binding.signInBtn.setOnClickListener {
            val signInIntent = Intent(mContext, MainActivity::class.java)
            startActivity(signInIntent)

        }

        binding.signUpBtn.setOnClickListener {
            val signUpIntent = Intent(mContext, SignUpActivity::class.java )
            startActivity(signUpIntent)
        }

        binding.findIdBtn.setOnClickListener {
            val findIdIntent = Intent(mContext, FindIdActivity::class.java)
            startActivity(findIdIntent)
        }

        binding.findPwdBtn.setOnClickListener {
            val findPwdIntent = Intent(mContext, FindPwdActivity::class.java)
            startActivity(findPwdIntent)
        }



    }

    override fun setValues() {
    }


}