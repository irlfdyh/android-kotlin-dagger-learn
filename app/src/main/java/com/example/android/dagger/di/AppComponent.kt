package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.ui.login.LoginComponent
import com.example.android.dagger.ui.registration.RegistrationComponent
import com.example.android.dagger.ui.splash.SplashComponent
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Definition of a Dagger component, that add info from the [StorageModule]
 * to the graph. And annotate a component with @Singleton, all the classes
 * will be scoped to its lifetime.
 */
@Singleton
@Component(modules = [StorageModule::class, AppSubComponents::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // with @BindInstance, the context passed in will be available in
        // the graph.
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Expose [RegistrationComponent] factory from the graph.
    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory
    fun splashComponent(): SplashComponent.Factory

    // Expose [UserManager] so that [MainActivity] and [SettingsActivity] can
    // access a particular instance of [UserComponent].
    fun userManager(): UserManager

}