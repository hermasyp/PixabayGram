package com.catnip.pixabayimage.data.network

import com.catnip.pixabayimage.BuildConfig
import com.catnip.pixabayimage.model.Feeds
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/

interface RetrofitApi {

    @GET("/videos")
    suspend fun getFeeds(
        @Query("q") query: String? = null,
        @Query("order") order:String? = null,
        @Query("page") page:Int): Response<Feeds>

    companion object{
        operator fun invoke(networkConnectionInterceptor: NetworkConnectionInterceptor) : RetrofitApi{
            val authInterceptor = Interceptor {chain->
                val newUrl = chain.request().url()
                    .newBuilder()
                    .addQueryParameter("key","12822027-81d45ed0f264c64935d2a871c")
                    .build()
                val newRequest = chain.request()
                    .newBuilder()
                    .url(newUrl)
                    .build()
                chain.proceed(newRequest)
            }

            val okkHttpclient = OkHttpClient.Builder()
                .addInterceptor(networkConnectionInterceptor)
                .addInterceptor(authInterceptor)
                .build()

            return Retrofit.Builder()
                .client(okkHttpclient)
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
                .create(RetrofitApi::class.java)
        }
    }
}