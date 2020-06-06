package com.example.android.dagger.ui.splash

import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val userManager: UserManager
) {

    private var _direction: String = ""
    val direction: String get() = _direction

    fun checkingUserState() {
        _direction = if (!userManager.isUserLoggedIn()) {
            if (!userManager.isUserRegistered()) {
                "didn't have account"
            } else {
                "have account"
            }
        } else {
            "logged in"
        }
    }

}