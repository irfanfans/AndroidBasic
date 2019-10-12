package com.android.finalsubsanbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.finalsubsanbasic.Model.Food

class MainActivity : AppCompatActivity() {
    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()
    private lateinit var listFood :ListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvFood = findViewById(R.id.rvMasakan)
        rvFood.setHasFixedSize(true)
         list.addAll(FoodData.listData)
        showRecyclerList()


    }
    private fun showSelectedHero(hero: Food) {
        Toast.makeText(this, "Kamu memilih " + hero.NamaMakanan, Toast.LENGTH_SHORT).show()
    }
    private fun showRecyclerList() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListAdapter(list)
        rvFood.adapter = listHeroAdapter
        listHeroAdapter.setOnItemClickCallback(object : ListAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                showSelectedHero(data)
            }
        })
    }
}
