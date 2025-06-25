package com.caramm.textextractor.core.designsystem

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.caramm.textextractor.ui.theme.TextExtractorTheme

@Composable
fun TextExtractorButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
    shape: Shape = ButtonDefaults.shape,
    containerColor: Color = Color.Unspecified
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        colors = ButtonDefaults.buttonColors(containerColor = containerColor)
    ) {
        TextExtractorText(
            modifier = Modifier.padding(vertical = 8.dp),
            text = text
        )
    }
}

@Composable
fun TextExtractorIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    imageVector: ImageVector = Icons.Default.Add,
    tint: Color = TextExtractorTheme.colors.text
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        TextExtractorIcon(
            imageVector = imageVector,
            tint = tint
        )
    }
}

@Preview
@Composable
private fun TextExtractorButtonPreview() {
    TextExtractorButton(
        onClick = {},
        text = "테스트 버튼"
    )
}
