package com.bimabagaskhoro.firstkmm.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers


internal interface Dispatcher {
    val io : CoroutineDispatcher
}

internal expect fun provideDispatcher(): Dispatcher