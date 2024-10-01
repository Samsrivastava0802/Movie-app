package com.samridhi.movieapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.samridhi.movieapplication.databinding.ActivityMainBinding
import com.samridhi.movieapplication.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

}