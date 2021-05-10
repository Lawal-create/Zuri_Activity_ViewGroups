package com.example.zuri_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.zuri_activity.adapters.FactAdapter
import com.example.zuri_activity.databinding.ActivityListViewBinding
import com.example.zuri_activity.databinding.ActivityMainBinding

class ListViewActivity : AppCompatActivity() {

    lateinit var binding:ActivityListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding.listView.let {
            it.adapter = FactAdapter(this@ListViewActivity, data.funfacts)
            it.divider = null
        }



    }


}
