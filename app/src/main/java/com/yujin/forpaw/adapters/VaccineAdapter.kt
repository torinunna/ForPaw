package com.yujin.forpaw.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.yujin.forpaw.datas.VaccineData

class VaccineAdapter (
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<VaccineData>) : ArrayAdapter<VaccineData>(mContext, resId, mList){
}