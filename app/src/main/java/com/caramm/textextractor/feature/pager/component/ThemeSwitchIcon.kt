package com.caramm.textextractor.feature.pager.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.caramm.textextractor.R
import com.caramm.textextractor.core.designsystem.TextExtractorIconButton
import com.caramm.textextractor.ui.theme.TextExtractorTheme

@Composable
fun ThemeSwitchButton(modifier: Modifier = Modifier) {
    TextExtractorIconButton(
        onClick = {
            TextExtractorTheme.updateTheme()
        },
        modifier = modifier,
        imageVector = ImageVector.vectorResource(
            if (TextExtractorTheme.isDarkTheme()) R.drawable.ic_theme_dark
            else R.drawable.ic_light_theme
        )
    )
}