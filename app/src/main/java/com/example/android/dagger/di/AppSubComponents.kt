package com.example.android.dagger.di

import com.example.android.dagger.ui.login.LoginComponent
import com.example.android.dagger.ui.registration.RegistrationComponent
import com.example.android.dagger.ui.splash.SplashComponent
import com.example.android.dagger.user.UserComponent
import dagger.Module

/**
 * This @Module tells [AppComponent] which are its subcomponents.
 */
@Module(subcomponents = [
    RegistrationComponent::class,
    LoginComponent::class,
    UserComponent::class,
    SplashComponent::class
])
class AppSubComponents