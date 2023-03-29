package com.bimabagaskhoro.firstkmm.di

import com.bimabagaskhoro.firstkmm.data.RemoteDataSource
import com.bimabagaskhoro.firstkmm.data.repository.MovieRepositoryImpl
import com.bimabagaskhoro.firstkmm.data.response.MovieService
import com.bimabagaskhoro.firstkmm.domain.repository.MovieRepository
import com.bimabagaskhoro.firstkmm.domain.usecase.GetMovieByIdUseCase
import com.bimabagaskhoro.firstkmm.domain.usecase.GetMovieUseCase
import com.bimabagaskhoro.firstkmm.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMovieUseCase() }
    factory { GetMovieByIdUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules
