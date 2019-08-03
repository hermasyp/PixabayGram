package com.catnip.pixabayimage.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.catnip.pixabayimage.model.Hit

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/

@Dao
interface FeedDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveAllFeeds(quotes : List<Hit>)

    @Query("SELECT * FROM Hit")
    fun getFeeds() : LiveData<List<Hit>>
}