package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Items>()
        for (i in 1..20) {
            data.add(Items(R.drawable.ic_launcher_background, "Item " + i, "Sub Items " + i))
        }

        val adapter = CustomAdapter(data)

        recyclerview.adapter = adapter

    }
}