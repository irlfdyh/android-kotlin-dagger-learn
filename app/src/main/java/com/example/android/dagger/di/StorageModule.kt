package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class RegistrationStorage

@Retention(AnnotationRetention.BINARY)
@Qualifier
annotation class LoginStorage

/**
 * Tell Dagger this is a Dagger module.
 * Because of @Binds, [StorageModule] needs to be an abstract class.
 */
@Module
class StorageModule {

    // @Provides tell Dagger how to create instances of the type that this function
    // return (i.e. Storage).
    // Function parameters are the dependencies of this type (i.e. Context).
    @Provides
    fun provideStorage(context: Context): Storage {
        // Whenever Dagger needs to provide an instance of type Storage,
        // this code (the one inside the @Provides method) will be run.
        return SharedPreferencesStorage(context)
    }

//    @RegistrationStorage
//    @Provides
//    fun provideRegistrationStorage(context: Context): Storage {
//        return SharedPreferencesStorage("registration", context)
//    }
//
//    @LoginStorage
//    @Provides
//    fun provideLoginStorage(context: Context): Storage {
//        return SharedPreferencesStorage("login", context)
//    }
}