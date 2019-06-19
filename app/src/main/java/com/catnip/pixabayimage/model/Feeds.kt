package com.catnip.pixabayimage.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Feeds(
    @Json(name = "hits")
    var hits: List<Hit>,
    @Json(name = "total")
    var total: Int,
    @Json(name = "totalHits")
    var totalHits: Int
)