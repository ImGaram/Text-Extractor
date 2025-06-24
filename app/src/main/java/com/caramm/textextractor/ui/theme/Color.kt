package com.caramm.textextractor.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

val TextLight = Color(0xFF333333)
val BackgroundLight = Color(0xFFECECEC)
val YellowLight = Color(0xFFF7F14A)
val LightBlueLight = Color(0xFF00BFFF)
val GrayLight = Color(0xFFD0D0D0)
val IconLight = Color(0xFFE7E7E7)

val TextDark = Color(0xFFE6E6E6)
val BackgroundDark = Color(0xFF4D4D4D)
val YellowDark = Color(0xFFF9DB22)
val LightBlueDark = Color(0xFF1D88DB)
val GrayDark = Color(0xFFCCCCCC)
val IconDark = Color(0xFFD7D7D7)


class TextExtractorColors(
    text: Color,
    background: Color,
    yellow: Color,
    lightBlue: Color,
    gray: Color,
    icon: Color
) {
    var text by mutableStateOf(text)
        private set
    var background by mutableStateOf(background)
        private set
    var yellow by mutableStateOf(yellow)
        private set
    var lightBlue by mutableStateOf(lightBlue)
        private set
    var gray by mutableStateOf(gray)
        private set
    var icon by mutableStateOf(icon)
        private set

    fun update(other: TextExtractorColors) {
        text = other.text
        background = other.background
        yellow = other.yellow
        lightBlue = other.lightBlue
        gray = other.gray
        icon = other.icon
    }

    fun copy() = TextExtractorColors(
        text = text,
        background = background,
        yellow = yellow,
        lightBlue = lightBlue,
        gray = gray,
        icon = icon
    )
}