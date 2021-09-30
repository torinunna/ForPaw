package com.yujin.forpaw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.yujin.forpaw.databinding.ActivityAddCheckUpBinding

class AddCheckUpActivity : BaseActivity() {

    lateinit var binding : ActivityAddCheckUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_add_check_up)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
    }
}