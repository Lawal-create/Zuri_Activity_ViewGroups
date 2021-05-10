package com.example.zuri_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.zuri_activity.adapters.FactAdapter
import com.example.zuri_activity.databinding.ActivityListViewBinding
import com.example.zuri_activity.databinding.ActivityMainBinding

class ListViewActivity : AppCompatActivity() {

    var Binding: ActivityMainBinding? =null
    var adapter:FactAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        var listView1=findViewById<ListView>(R.id.listView)
        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding?.root)
        adapter=FactAdapter(this,data.funfacts)
        listView1.adapter=adapter



    }

    override fun onDestroy() {
        super.onDestroy()
        Binding=null
    }



}