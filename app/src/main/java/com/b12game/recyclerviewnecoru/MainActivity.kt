package com.b12game.recyclerviewnecoru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.b12game.recyclerviewnecoru.adapter.PlantAdapter
import com.b12game.recyclerviewnecoru.model.Planf

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        button = findViewById(R.id.button)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,3)
        val adapter = PlantAdapter(this,plantList())
        recyclerView.adapter = adapter
        button.setOnClickListener {
            val plant = Planf("Banana",R.drawable.im_1)
            adapter.addToList(plant)
        }
    }


    private fun plantList(): ArrayList<Planf> {
//        val imageList = listOf(R.drawable.im_1,R.drawable.im_4,R.drawable.im_6,R.drawable.im_7,R.drawable.im_9,R.drawable.im_10)
//        var index = 0
//        if(index > 4) index = 0
        val item : ArrayList<Planf> = ArrayList()
        item.add(Planf("Banana",R.drawable.ic_launcher_background))

//        index++
        return item
    }
}