package com.bimabagaskhoro.firstkmm.data.repository

import com.bimabagaskhoro.firstkmm.data.RemoteDataSource
import com.bimabagaskhoro.firstkmm.domain.model.MovieData
import com.bimabagaskhoro.firstkmm.domain.repository.MovieRepository
import com.bimabagaskhoro.firstkmm.helper.mapper.toMovie

internal class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : MovieRepository {
    override suspend fun getMovies(page: Int): List<MovieData> {
        return remoteDataSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovieId(movieId: Int): MovieData {
        return remoteDataSource.getMovieId(movieId = movieId).toMovie()
    }
}