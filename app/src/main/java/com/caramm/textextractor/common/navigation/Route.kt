package com.caramm.textextractor.common.navigation

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object Permission

    @Serializable
    data object CreateDocument

    @Serializable
    data object Files

    @Serializable
    data class ModifyFile(val ocrRes: String)
}
