package com.example.zuri_activity.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.zuri_activity.R
import com.example.zuri_activity.models.FactModel

class FactAdapter(context:Context,facts:List<FactModel>):ArrayAdapter<FactModel>(context,0,facts) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view=convertView
        var fact=getItem(position)
        if(view==null){
            view=LayoutInflater.from(parent.context).inflate(R.layout.item_container,parent,false)
        }
        var logo=view?.findViewById<ImageView>(R.id.logo)
        var name=view?.findViewById<TextView>(R.id.name)

        fact?.logo?.let{
            logo?.setImageResource(fact.logo)
        }
        name?.text=fact?.name

        return super.getView(position, convertView, parent)
    }
}