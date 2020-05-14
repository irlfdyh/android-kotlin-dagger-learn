package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationComponent
import dagger.Module

/**
 * This @Module tells [AppComponent] which are its subcomponents.
 */
@Module(subcomponents = [RegistrationComponent::class])
class AppSubComponents