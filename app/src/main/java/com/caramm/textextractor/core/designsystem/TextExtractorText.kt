package com.caramm.textextractor.core.designsystem

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import com.caramm.textextractor.ui.theme.TextExtractorTheme

@Composable
fun TextExtractorText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = TextExtractorTheme.colors.text,
    style: TextStyle = TextExtractorTheme.type.normal14,
    textAlign: TextAlign? = null
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        style = style,
        textAlign = textAlign
    )
}