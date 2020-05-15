package com.example.android.dagger.di

import com.example.android.dagger.login.LoginComponent
import com.example.android.dagger.registration.RegistrationComponent
import com.example.android.dagger.user.UserComponent
import dagger.Module

/**
 * This @Module tells [AppComponent] which are its subcomponents.
 */
<<<<<<< HEAD
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class])
=======
@Module(subcomponents = [
    RegistrationComponent::class,
    LoginComponent::class,
    UserComponent::class])
>>>>>>> with_testing
class AppSubComponents