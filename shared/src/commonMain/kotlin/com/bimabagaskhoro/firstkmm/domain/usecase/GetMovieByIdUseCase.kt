package com.bimabagaskhoro.firstkmm.domain.usecase

import com.bimabagaskhoro.firstkmm.domain.model.MovieData
import com.bimabagaskhoro.firstkmm.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetMovieByIdUseCase : KoinComponent {
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(movieId: Int): MovieData {
        return repository.getMovieId(movieId = movieId)
    }
}