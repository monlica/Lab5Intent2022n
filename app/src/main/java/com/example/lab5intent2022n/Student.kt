package com.example.lab5intent2022n

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(val id:String, val name: String, val age:Int, val hobby: String) : Parcelable {
}
