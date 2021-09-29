package com.yujin.forpaw.datas

class FriendData(
    val name : String,
    val birthYear : Int) {

    fun getAgeByYear( year : Int ) : Int {

        val age = year - this.birthYear

        return age

    }

}