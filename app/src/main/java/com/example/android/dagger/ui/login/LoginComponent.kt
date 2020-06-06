package com.example.android.dagger.ui.login

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

/**
 * Scope annotation that the [LoginComponent] uses
 * Classes annotated with @ActivityScope will have a unique instance
 * in this Component.
 */
@ActivityScope
@Subcomponent
interface LoginComponent {

    // Factory to create instances of [LoginComponent]
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    // Classes that can be injected by this component
    fun inject(activity: LoginActivity)
}