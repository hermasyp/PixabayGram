package com.catnip.pixabayimage.model


import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
data class Videos(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    @Embedded(prefix = "size_large")
    @Json(name = "large")
    var large: Size,

    @Embedded(prefix = "size_medium")
    @Json(name = "medium")
    var medium: Size,

    @Embedded(prefix = "size_small")
    @Json(name = "small")
    var small: Size,

    @Embedded(prefix = "size_tiny")
    @Json(name = "tiny")
    var tiny: Size
)