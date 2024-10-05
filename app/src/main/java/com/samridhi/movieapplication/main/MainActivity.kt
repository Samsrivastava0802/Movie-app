package com.samridhi.movieapplication.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.samridhi.movieapplication.R
import androidx.activity.viewModels
import com.samridhi.movieapplication.databinding.ActivityMainBinding
import com.samridhi.movieapplication.main.adapter.MainAdapter
import com.samridhi.movieapplication.main.viewModel.MainViewModel
import com.samridhi.movieapplication.network.model.Movies
import com.samridhi.movieapplication.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var mainAdapter: MainAdapter

    private val viewModel: MainViewModel by viewModels()

    private val list: MutableList<Movies> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initRecyclerView()
        initObservers()

    }

    private fun initRecyclerView(){
       val llm = LinearLayoutManager(this
       , LinearLayoutManager.HORIZONTAL, false)
        binding.rvCategories.setHasFixedSize(true)
        binding.rvCategories.layoutManager = llm
        mainAdapter = MainAdapter(this)
        binding.rvCategories.adapter = mainAdapter

        val llm2 = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvMoviesList.setHasFixedSize(true)
        binding.rvMoviesList.layoutManager = llm2
        mainAdapter = MainAdapter(this)
        binding.rvMoviesList.adapter = mainAdapter

    }

    private fun initObservers(){
        viewModel.movieData.observe(this){
            if(it != null){
              list.add(it)
                mainAdapter.submitList(list[0].genres)
            }
        }
    }

}