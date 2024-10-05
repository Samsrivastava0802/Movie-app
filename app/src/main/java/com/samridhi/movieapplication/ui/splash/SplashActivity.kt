package com.samridhi.movieapplication.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.databinding.DataBindingUtil
import com.samridhi.movieapplication.main.MainActivity
import com.samridhi.movieapplication.R
import com.samridhi.movieapplication.databinding.ActivitySplashBinding
import com.samridhi.movieapplication.ui.base.BaseActivity


class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        gotoMainActivity()
    }

    private fun gotoMainActivity(){
        Handler(Looper.getMainLooper()).postDelayed(
            Runnable {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }, 500
        )
    }
}