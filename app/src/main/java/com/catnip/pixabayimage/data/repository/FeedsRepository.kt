package com.catnip.pixabayimage.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.catnip.pixabayimage.data.db.PixabayDatabase
import com.catnip.pixabayimage.data.network.BaseRequest
import com.catnip.pixabayimage.data.network.RetrofitApi
import com.catnip.pixabayimage.model.Hit
import com.catnip.pixabayimage.utils.Coroutines
import com.catnip.pixabayimage.utils.NoInternetException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/

class FeedsRepository(private val api: RetrofitApi, private val db: PixabayDatabase) : BaseRequest(){
    private val feeds = MutableLiveData<List<Hit>>()

    init {
        feeds.observeForever{
            saveFeeds(it)
        }
    }

    suspend fun getFeeds(): LiveData<List<Hit>> {
        return withContext(Dispatchers.IO){
            fetchQuotes()
            db.getFeedDao().getFeeds()
        }
    }

    private suspend fun fetchQuotes() {
        try {
            val response = request { api.getFeeds(order = "popular",page = 1) }
            feeds.postValue(response.hits)
        }catch (e: NoInternetException){
            //handle something if no connection
        }
    }

    private fun saveFeeds(feeds: List<Hit>) {
        Coroutines.io {
            db.getFeedDao().saveAllFeeds(feeds)
        }
    }


}