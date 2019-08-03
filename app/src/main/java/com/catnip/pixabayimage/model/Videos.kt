package com.catnip.pixabayimage.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
data class Videos(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @Json(name = "large")
    var large: Size,
    @Json(name = "medium")
    var medium: Size,
    @Json(name = "small")
    var small: Size,
    @Json(name = "tiny")
    var tiny: Size
)