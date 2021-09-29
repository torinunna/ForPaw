package com.yujin.forpaw.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.yujin.forpaw.R
import com.yujin.forpaw.datas.FriendData

class FriendAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<FriendData>) : ArrayAdapter<FriendData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.friend_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)

        nameTxt.text = data.name

        ageTxt.text = "(${data.getAgeByYear(2021)} 살)"

        return row
    }

}

