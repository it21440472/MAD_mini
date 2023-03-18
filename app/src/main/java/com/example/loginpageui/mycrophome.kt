package com.example.loginpageui

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.loginpageui.model.cropdata
import com.example.loginpageui.model.view.cropAdapter

class mycrophome : AppCompatActivity() {

    private lateinit var addbtn:Button
    private lateinit var recv:RecyclerView
    private lateinit var cropList: ArrayList<cropdata>
    private lateinit var cropAdapter: cropAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mycrophome)

        cropList = ArrayList()

        addbtn = findViewById(R.id.addbtn)
        recv = findViewById(R.id.mRecycler)

        cropAdapter = cropAdapter(this,cropList)

        recv.layoutManager = LinearLayoutManager(this)
        recv.adapter = cropAdapter

        addbtn.setOnClickListener{addInfo()}




        val backbuttton = findViewById<Button>(R.id.backbtn)
        backbuttton.setOnClickListener {
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }/**
        val addbtn = findViewById<Button>(R.id.addbtn)
        addbtn.setOnClickListener {
            val Intent = Intent(this,MainActivity4::class.java)
            startActivity(Intent)
        }  **/
    }

    private fun addInfo() {
        val inflater = LayoutInflater.from(this)
        val v = inflater.inflate(R.layout.add_crop,null)
        /**set views**/
        val cropName = v.findViewById<EditText>(R.id.addcropname)
        val cropType = findViewById<EditText>(R.id.addcroptype)
        val addDialog = AlertDialog.Builder(this)


        addDialog.setView(v)
        addDialog.setPositiveButton("Ok "){

                dialog,_->
            val cnames = cropName.text.toString()
            val ctype = cropType.text.toString()

            cropList.add(cropdata("Crop Name: $cnames","Type: $ctype"))
            cropAdapter.notifyDataSetChanged()
            Toast.makeText(this,"Crop Added",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        addDialog.setNegativeButton("Cancel"){
            dialog,_->
            dialog.dismiss()
            Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()
        }
        addDialog.create()
        addDialog.show()

    }



}