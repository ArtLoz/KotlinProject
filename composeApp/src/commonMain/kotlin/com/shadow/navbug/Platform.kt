package com.shadow.navbug

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform