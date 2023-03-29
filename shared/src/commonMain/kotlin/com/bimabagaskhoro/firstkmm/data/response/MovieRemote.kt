package com.bimabagaskhoro.firstkmm.data.response

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
internal data class MovieRemote(
    val id: Int,
    val tittle: String,
    val overview: String,

    @SerialName("poster_path")
    val posterImage: String,

    @SerialName("release_date")
    val releaseDate: String
)

@kotlinx.serialization.Serializable
internal data class MovieResponse(
    val results: List<MovieRemote>
)
