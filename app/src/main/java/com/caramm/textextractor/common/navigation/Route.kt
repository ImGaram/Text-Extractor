package com.caramm.textextractor.common.navigation

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object Permission: Route

    @Serializable
    data object Pager: Route

    @Serializable
    data class ModifyFile(val ocrRes: String): Route
}
