package com.catnip.pixabayimage

import android.app.Application
import com.catnip.pixabayimage.di.databaseModule
import com.catnip.pixabayimage.di.networkModule
import com.catnip.pixabayimage.di.repositoryModule
import com.catnip.pixabayimage.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class PixabayApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@PixabayApp)
            modules(listOf(repositoryModule,databaseModule, networkModule, viewModelModule))
        }
    }
}