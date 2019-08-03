package com.catnip.pixabayimage.data.network

import com.catnip.pixabayimage.utils.ApiException
import retrofit2.Response

abstract class BaseRequest {

    suspend fun<T: Any> request(call: suspend () -> Response<T>) : T{
        val response = call.invoke()
        if(response.isSuccessful){
            return response.body()!!
        }else{
            val error = response.errorBody()?.string()
            throw ApiException(error.toString())
        }
    }

}