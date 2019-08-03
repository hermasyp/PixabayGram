package com.catnip.pixabayimage.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.catnip.pixabayimage.model.Hit
import com.catnip.pixabayimage.model.Size
import com.catnip.pixabayimage.model.Videos

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
@Database(
    entities = [Hit::class, Size::class,Videos::class],
    version = 1
)
abstract class PixabayDatabase : RoomDatabase(){
    abstract fun getFeedDao() : FeedDao

    companion object {

        @Volatile
        private var instance: PixabayDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                PixabayDatabase::class.java,
                "PixabayGram.db"
            ).build()
    }
}