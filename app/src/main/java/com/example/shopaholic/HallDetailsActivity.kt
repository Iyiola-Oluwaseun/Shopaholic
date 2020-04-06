package com.example.shopaholic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.shopaholic.databinding.ActivityHallDetailsBinding
import kotlinx.android.synthetic.main.activity_hall_details.*

class HallDetailsActivity : AppCompatActivity() {
     lateinit var binding : ActivityHallDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_hall_details)
        hall_name.text = getIntent().getStringExtra("PRODUCTNAME")
        hall_description.text = getIntent().getStringExtra("PRODUCTDESC")
        halllogo.setImageResource(getIntent().getStringExtra("PRODUCTLOGO").toInt())
    }
}
