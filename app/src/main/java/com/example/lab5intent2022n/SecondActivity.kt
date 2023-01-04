package com.example.lab5intent2022n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab5intent2022n.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var bindingSecond : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingSecond = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(bindingSecond.root)

        //Get data from Parcelable
        var data = intent.extras
        var newStudent:Student? = data?.getParcelable("stdData")

        //Show data
        bindingSecond.txtID.text = "Student ID : ${newStudent?.id} "
        bindingSecond.txtName.text = "Student Name : ${newStudent?.name}"
        bindingSecond.txtAge.text = "Student Age : ${newStudent?.age}"
        bindingSecond.txtHobby.text = "Student Hobby : ${newStudent?.hobby}"

        // Close Button
        bindingSecond.btnClose.setOnClickListener {
            finish()
        }
    }
}