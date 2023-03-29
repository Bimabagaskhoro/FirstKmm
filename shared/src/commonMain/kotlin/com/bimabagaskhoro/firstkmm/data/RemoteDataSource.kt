package com.bimabagaskhoro.firstkmm.data

import com.bimabagaskhoro.firstkmm.data.response.MovieService
import com.bimabagaskhoro.firstkmm.util.Dispatcher
import kotlinx.coroutines.withContext

internal class RemoteDataSource(
    private val apiService: MovieService,
    private val dispatcher: Dispatcher
) {
    suspend fun getMovies(page: Int) = withContext(dispatcher.io) {
        apiService.getMovies(page = page)
    }

    suspend fun getMovieId(movieId: Int) = withContext(dispatcher.io) {
        apiService.getMovieId(movieId = movieId)
    }
}