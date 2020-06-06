package com.example.android.dagger.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.dagger.MyApplication
import com.example.android.dagger.R
import com.example.android.dagger.ui.login.LoginActivity
import com.example.android.dagger.ui.main.MainActivity
import com.example.android.dagger.ui.registration.RegistrationActivity
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        (application as MyApplication).appComponent
            .splashComponent().create().inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setupDirection()

    }

    private fun setupDirection() {
        splashViewModel.checkingUserState()

        when (splashViewModel.direction) {
            "didn't have account" -> {
                startActivity(Intent(this, RegistrationActivity::class.java))
                finish()
            }
            "have account" -> {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
            else -> {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }

}