package com.catnip.pixabayimage.repository

import com.catnip.pixabayimage.repository.remote.RetrofitApi
import com.catnip.pixabayimage.repository.remote.RetrofitFactory
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class FeedsRepository{
    fun getFeeds(){
        val service = RetrofitFactory.retrofit().create(RetrofitApi::class.java)
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getFeeds(order = "popular",page = 1)
            withContext(Dispatchers.Main){
                try {
                    if (response.isSuccessful){
                        //store to local
                    }else{
                        //handling unsuccessfull data
                    }
                }catch (e: HttpException) {
                    //todo: logging error
                } catch (e: Throwable) {
                    //todo: logging error
                }
            }
        }

    }
}