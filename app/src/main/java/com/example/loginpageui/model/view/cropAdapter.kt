

package com.example.loginpageui.model.view

import android.content.Context
import android.service.autofill.UserData
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.loginpageui.R
import com.example.loginpageui.model.cropdata

class cropAdapter (val c:Context,val cropList:ArrayList<cropdata>):RecyclerView.Adapter<cropAdapter.cropViewwHolder>()
{

    inner class cropViewwHolder(val v:View):RecyclerView.ViewHolder(v){
        val name = v.findViewById<TextView>(R.id.crname)
        val type = v.findViewById<TextView>(R.id.crtype)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cropViewwHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.list_item,parent,false)
        return cropViewwHolder(v)
    }

    override fun getItemCount(): Int {

        return cropList.size
    }

    override fun onBindViewHolder(holder: cropViewwHolder, position: Int) {

        val newList = cropList[position]
        holder.name.text = newList.cropName
        holder.type.text = newList.cropType


    }

}