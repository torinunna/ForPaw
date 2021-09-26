package com.yujin.forpaw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yujin.forpaw.adapters.VaccineAdapter
import com.yujin.forpaw.datas.VaccineData

class VaccineActivity : AppCompatActivity() {
    val mVaccineList = ArrayList<VaccineData>()

    lateinit var mAdapter : VaccineAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vaccine_list)

        mAdapter = VaccineAdapter(this,R.layout.vaccine_list, mVaccineList )

    }
}