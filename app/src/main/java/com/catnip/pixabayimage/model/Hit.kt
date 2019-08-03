package com.catnip.pixabayimage.model


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
data class Hit(
    @PrimaryKey(autoGenerate = false)
    @Json(name = "id")
    var id: Int,

    @Json(name = "comments")
    var comments: Int,
    @Json(name = "downloads")
    var downloads: Int,
    @Json(name = "duration")
    var duration: Int,
    @Json(name = "favorites")
    var favorites: Int,
    @Json(name = "likes")
    var likes: Int,
    @Json(name = "pageURL")
    var pageURL: String,
    @Json(name = "picture_id")
    var pictureId: String,
    @Json(name = "tags")
    var tags: String,
    @Json(name = "type")
    var type: String,
    @Json(name = "user")
    var user: String,
    @Json(name = "user_id")
    var userId: Int,
    @Json(name = "userImageURL")
    var userImageURL: String,
    @Embedded
    @Json(name = "videos")
    var videos: Videos,
    @Json(name = "views")
    var views: Int
)