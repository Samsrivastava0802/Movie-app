package com.samridhi.movieapplication.ui.details

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.samridhi.movieapplication.R
import com.samridhi.movieapplication.databinding.ActivityDetailsBinding
import com.samridhi.movieapplication.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsActivity : BaseActivity(), View.OnClickListener{

  private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_details)

        initAction()

        val movieTitle = intent.getStringExtra("movieTitle")
        val director = intent.getStringExtra("directorName")
        val rating = intent.getDoubleExtra("rating", 0.0)

        binding.tvText.text = movieTitle
        binding.directorName.text = "Director: $director"
        binding.rating.text = "$rating ★"
    }

    private fun initAction(){
        binding.ivBack.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id){
         R.id.ivBack ->{
          finish()
         }
        }
    }
}