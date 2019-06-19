package com.catnip.pixabayimage.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Videos(
    @Json(name = "large")
    var large: Large,
    @Json(name = "medium")
    var medium: Medium,
    @Json(name = "small")
    var small: Small,
    @Json(name = "tiny")
    var tiny: Tiny
)