package com.bimabagaskhoro.firstkmm.android.di

import com.bimabagaskhoro.firstkmm.android.detail.DetailViewModel
import com.bimabagaskhoro.firstkmm.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}