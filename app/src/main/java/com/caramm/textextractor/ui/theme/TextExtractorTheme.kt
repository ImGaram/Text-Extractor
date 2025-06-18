package com.caramm.textextractor.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object TextExtractorTheme {
    val colors: TextExtractorColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val type: TextExtractorType
        @Composable
        @ReadOnlyComposable
        get() = LocalType.current
}