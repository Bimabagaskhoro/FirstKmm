package com.bimabagaskhoro.firstkmm.helper.mapper

import com.bimabagaskhoro.firstkmm.data.response.MovieRemote
import com.bimabagaskhoro.firstkmm.domain.model.MovieData

internal fun MovieRemote.toMovie(): MovieData {
    return MovieData(
        id = id,
        tittle = tittle,
        overview = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w300$posterImage"