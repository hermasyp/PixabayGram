package com.catnip.pixabayimage.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Large(
    @Json(name = "height")
    var height: Int,
    @Json(name = "size")
    var size: Int,
    @Json(name = "url")
    var url: String,
    @Json(name = "width")
    var width: Int
)