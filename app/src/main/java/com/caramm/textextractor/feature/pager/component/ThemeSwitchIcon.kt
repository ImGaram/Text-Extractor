package com.caramm.textextractor.feature.pager.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.caramm.textextractor.R
import com.caramm.textextractor.common.utils.Theme
import com.caramm.textextractor.core.designsystem.TextExtractorIconButton
import com.caramm.textextractor.core.persentation.ThemeViewModel

@Composable
fun ThemeSwitchButton(
    modifier: Modifier = Modifier,
    themeViewModel: ThemeViewModel = hiltViewModel()
) {
    val theme = themeViewModel.theme.collectAsState()

    TextExtractorIconButton(
        onClick = {
            themeViewModel.updateTheme()
        },
        modifier = modifier,
        imageVector = ImageVector.vectorResource(
            if (theme.value == Theme.DARK) R.drawable.ic_theme_dark
            else R.drawable.ic_light_theme
        )
    )
}