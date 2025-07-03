package com.caramm.textextractor.core.persentation.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.caramm.textextractor.common.utils.Theme

object TextExtractorTheme {
    val colors: TextExtractorColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val type: TextExtractorType
        @Composable
        @ReadOnlyComposable
        get() = LocalType.current

    var theme by mutableStateOf(Theme.LIGHT)

    fun isDarkTheme(): Boolean {
        return theme == Theme.DARK
    }

    fun updateTheme() {
        theme = if (isDarkTheme()) Theme.LIGHT else Theme.DARK
    }
}