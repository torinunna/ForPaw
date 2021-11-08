package com.yujin.forpaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityCheckUpBinding

class CheckUpActivity : BaseActivity() {

    lateinit var binding : ActivityCheckUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_check_up)
        setupEvents()
        setValues()

    }

    override fun setupEvents() {

        binding.addBtn.setOnClickListener {
           val addIntent = Intent(mContext, AddCheckUpActivity::class.java)
            startActivity(addIntent)
        }

    }

    override fun setValues() {

    }
}