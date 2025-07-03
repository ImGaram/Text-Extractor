package com.caramm.textextractor.core.persentation.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import com.caramm.textextractor.common.utils.Theme

private val TextExtractorDarkColors = TextExtractorColors(
    text = TextDark,
    background = BackgroundDark,
    yellow = YellowDark,
    lightBlue = LightBlueDark,
    gray = GrayDark,
    icon = IconDark
)

private val TextExtractorLightColors = TextExtractorColors(
    text = TextLight,
    background = BackgroundLight,
    yellow = YellowLight,
    lightBlue = LightBlueLight,
    gray = GrayLight,
    icon = IconLight
)

@Composable
private fun ProvideTextExtractorTheme(
    colors: TextExtractorColors,
    type: TextExtractorType,
    content: @Composable () -> Unit
) {
    val colorPalette = remember { colors.copy() }
    colorPalette.update(colors)

    CompositionLocalProvider(
        LocalColors provides colorPalette,
        LocalType provides type,
        content = content
    )
}

private val Theme.colors: TextExtractorColors
    get() = when(this) {
        Theme.LIGHT -> TextExtractorLightColors
        Theme.DARK -> TextExtractorDarkColors
    }

@Composable
fun TextExtractorTheme(
    theme: Theme,
    content: @Composable () -> Unit
) {
    ProvideTextExtractorTheme(
        colors = theme.colors,
        type = TextExtractorTheme.type,
        content = content
    )
}

val LocalColors = staticCompositionLocalOf { TextExtractorLightColors }
val LocalType = staticCompositionLocalOf { TextExtractorType() }