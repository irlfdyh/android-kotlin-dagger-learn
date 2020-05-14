package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

// Definition of a Dagger component, that add info from the [StorageModule]
// to the graph.
@Component(modules = [StorageModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // with @BindInstance, the context passed in will be available in
        // the graph.
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Classes that can be injected by this component.
    fun inject(activity: RegistrationActivity)
}