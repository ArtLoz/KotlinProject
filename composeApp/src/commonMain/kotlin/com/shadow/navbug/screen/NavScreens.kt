package com.shadow.navbug.screen

import kotlinx.serialization.Serializable

sealed interface NavScreens {

    @Serializable
    data object ScreenA: NavScreens

    @Serializable
    data object ScreenB: NavScreens

}