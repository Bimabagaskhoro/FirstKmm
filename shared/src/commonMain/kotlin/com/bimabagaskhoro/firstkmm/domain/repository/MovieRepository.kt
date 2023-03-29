package com.bimabagaskhoro.firstkmm.domain.repository

import com.bimabagaskhoro.firstkmm.domain.model.MovieData

interface MovieRepository {
    suspend fun getMovies(page: Int): List<MovieData>
    suspend fun getMovieId(movieId: Int): MovieData
}