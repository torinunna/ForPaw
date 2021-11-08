package com.yujin.forpaw

import android.app.ActionBar
import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mContext = this

        supportActionBar?.hide()

    }
    abstract fun setupEvents()
    abstract fun setValues()


}