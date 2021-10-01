package com.yujin.forpaw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yujin.forpaw.databinding.ActivityCustomActionBarBinding

class CustomActionBarActivity : BaseActivity() {

    lateinit var binding : ActivityCustomActionBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_action_bar)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }
}