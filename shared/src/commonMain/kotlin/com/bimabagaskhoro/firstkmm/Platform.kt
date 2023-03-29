package com.bimabagaskhoro.firstkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform