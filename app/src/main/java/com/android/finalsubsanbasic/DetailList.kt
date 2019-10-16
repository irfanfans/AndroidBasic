package com.android.finalsubsanbasic

import android.media.Image
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.android.finalsubsanbasic.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

import kotlinx.android.synthetic.main.activity_detail_list.*

class DetailList : AppCompatActivity() {
    companion object {
        const val Extr_Name = "nama"
        const val Extra_Detail = "detail"
        const val Extra_Gambar = "image"
    }

    private lateinit var tvdet: TextView
    private lateinit var tvjudul: TextView
    private lateinit var imgdeta: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_list)
//        setSupportActionBar(toolbar)
        tvdet = findViewById<TextView>(R.id.tvdetail)
        tvjudul = findViewById<TextView>(R.id.tvJudul)
        imgdeta = findViewById<ImageView>(R.id.imgDetail)

        val name  = intent.getStringExtra(Extr_Name)
        val detail = intent.getStringExtra(Extra_Detail)
        val  imgdet = intent.getStringExtra(Extra_Gambar)
        Log.d(name,"nama")
        Log.d(imgdet,"img")
        Log.d(detail,"dtaa")
        Glide.with(this)
            .load(imgdet)
            .into(imgdeta)
        tvdet.text= name
        tvdet.text = detail

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
