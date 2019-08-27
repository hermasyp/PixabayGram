package com.catnip.pixabayimage.di

import com.catnip.pixabayimage.data.db.PixabayDatabase
import com.catnip.pixabayimage.data.network.NetworkConnectionInterceptor
import com.catnip.pixabayimage.data.network.RetrofitApi
import com.catnip.pixabayimage.data.repository.FeedsRepository
import com.catnip.pixabayimage.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/

val viewModelModule = module{
    viewModel {MainViewModel(get())}
}
val repositoryModule = module {
    single { FeedsRepository(get(),get()) }
}

val networkModule = module {
    single { RetrofitApi(get()) }
    single { NetworkConnectionInterceptor(get()) }
}

val databaseModule = module {
    single { PixabayDatabase(get()) }
}