package com.bimabagaskhoro.firstkmm.domain.model

import kotlinx.serialization.SerialName

data class MovieData(
    val id: Int,
    val tittle: String,
    val overview: String,
    val imageUrl: String,
    val releaseDate: String
)
