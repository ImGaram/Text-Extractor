package com.caramm.textextractor.core.designsystem

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.caramm.textextractor.core.persentation.ui.theme.TextExtractorTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextExtractorTopBar(
    title: String = "",
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable (RowScope.() -> Unit) = {},
    color: Color = TextExtractorTheme.colors.text
) {
    TopAppBar(
        title = {
            TextExtractorText(
                text = title,
                color = color,
                style = TextExtractorTheme.type.medium16
            )
        },
        modifier = modifier,
        navigationIcon = navigationIcon,
        actions = actions,
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
    )
}

@Preview
@Composable
private fun TextExtractorTopBarPreview() {
    TextExtractorTopBar(
        title = "테스트 test",
        modifier = Modifier.fillMaxWidth(),
        actions = {
            TextExtractorIconButton(
                onClick = {}
            )
        },
        color = TextExtractorTheme.colors.icon
    )
}