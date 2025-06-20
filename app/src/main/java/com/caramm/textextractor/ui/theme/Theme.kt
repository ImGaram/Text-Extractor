package com.caramm.textextractor.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

private val TextExtractorDarkColors = TextExtractorColors(
    text = TextDark,
    background = BackgroundDark,
    yellow = YellowDark,
    lightBlue = LightBlueDark,
    gray = GrayDark,
    file = FileDark
)

private val TextExtractorLightColors = TextExtractorColors(
    text = TextLight,
    background = BackgroundLight,
    yellow = YellowLight,
    lightBlue = LightBlueLight,
    gray = GrayLight,
    file = FileLight
)

@Composable
private fun ProvideTextExtractorTheme(
    colors: TextExtractorColors,
    type: TextExtractorType,
    content: @Composable () -> Unit
) {
    val colorPalette = remember { colors }
    colorPalette.update(colors)

    CompositionLocalProvider(
        LocalColors provides colorPalette,
        LocalType provides type,
        content = content
    )
}

@Composable
fun TextExtractorTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = remember {
        if (darkTheme) TextExtractorDarkColors else TextExtractorLightColors
    }

    ProvideTextExtractorTheme(
        colors = colors,
        type = TextExtractorTheme.type,
        content = content
    )
}

val LocalColors = staticCompositionLocalOf { TextExtractorLightColors }
val LocalType = staticCompositionLocalOf { TextExtractorType() }