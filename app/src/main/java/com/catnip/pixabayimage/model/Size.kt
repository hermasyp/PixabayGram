package com.catnip.pixabayimage.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
data class Size(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @Json(name = "height")
    var height: Int,
    @Json(name = "size")
    var size: Int,
    @Json(name = "url")
    var url: String,
    @Json(name = "width")
    var width: Int
)