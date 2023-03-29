package com.bimabagaskhoro.firstkmm.data.response

import com.bimabagaskhoro.firstkmm.data.remote.KtorApi
import io.ktor.client.call.*
import io.ktor.client.request.*

internal class MovieService : KtorApi() {
    suspend fun getMovies(page: Int = 1): MovieResponse = client.get {
        pathUrl("movie/popular")
        parameter("page", page)
    }.body()

    suspend fun getMovieId(movieId: Int): MovieRemote = client.get {
        pathUrl("movie/${movieId}")
    }.body()
}