package com.caramm.textextractor.core.designsystem

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.caramm.textextractor.core.persentation.ui.theme.TextExtractorTheme

@Composable
fun TextExtractorIcon(
    imageVector: ImageVector = Icons.Default.Add,
    modifier: Modifier = Modifier,
    tint: Color = TextExtractorTheme.colors.icon
) {
    Icon(
        imageVector = imageVector,
        contentDescription = "TextExtractor Icon",
        modifier = modifier,
        tint = tint
    )
}

@Preview
@Composable
private fun TextExtractorIconPreview() {
    Column {
        TextExtractorIcon()

        TextExtractorIconButton(
            onClick = {},
            tint = TextExtractorTheme.colors.yellow
        )
    }
}
