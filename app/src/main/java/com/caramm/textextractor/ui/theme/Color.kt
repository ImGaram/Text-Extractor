package com.caramm.textextractor.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

val TextLight = Color(0xFF333333)
val BackgroundLight = Color(0xFFECECEC)
val YellowLight = Color(0xFFF7F14A)
val LightBlueLight = Color(0xFF87CEEB)
val GrayLight = Color(0xFF999999)

val TextDark = Color(0xFFE6E6E6)
val BackgroundDark = Color(0xFF4D4D4D)
val YellowDark = Color(0xFFF9DB22)
val LightBlueDark = Color(0xFF91BAD6)
val GrayDark = Color(0xFFCCCCCC)

class TextExtractorColors(
    text: Color,
    background: Color,
    yellow: Color,
    lightBlue: Color,
    gray: Color
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

    fun update(other: TextExtractorColors) {
        text = other.text
        background = other.background
        yellow = other.yellow
        lightBlue = other.lightBlue
        gray = other.gray
    }
}