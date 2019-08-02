package com.catnip.pixabayimage.repository.remote

import com.catnip.pixabayimage.model.Feeds
import retrofit2.Response
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
}