package com.yujin.forpaw

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yujin.forpaw.adapters.VaccineAdapter
import com.yujin.forpaw.databinding.ActivityVaccinateRecordBinding
import com.yujin.forpaw.datas.VaccineData

abstract class VaccineActivity : BaseActivity() {

    lateinit var binding: ActivityVaccinateRecordBinding

    val mVaccineList = ArrayList<VaccineData>()


    lateinit var mAdapter : VaccineAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccinate_record)

        mVaccineList.add(VaccineData("종합예방접종", 21/3/16, 22/3/16))
        mVaccineList.add(VaccineData("광견병", 21/4/1, 22/4/1))
        mVaccineList.add(VaccineData("코로나", 21/3/16, 22/3/16))
        mVaccineList.add(VaccineData("켄넬코프", 21/4/1, 22/4/1))
        mVaccineList.add(VaccineData("인플루엔자", 21/4/1, 22/4/1))



        mAdapter = VaccineAdapter(this,R.layout.activity_vaccinate_record, mVaccineList )

    }
}