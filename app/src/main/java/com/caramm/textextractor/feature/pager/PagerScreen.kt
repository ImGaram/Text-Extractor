package com.caramm.textextractor.feature.pager

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.caramm.textextractor.core.designsystem.TextExtractorIconButton
import com.caramm.textextractor.core.designsystem.TextExtractorTopBar
import com.caramm.textextractor.feature.modifyfile.navigation.navigateToModifyFile
import com.caramm.textextractor.feature.pager.component.SubTitleTopBar
import com.caramm.textextractor.feature.pager.component.ThemeSwitchButton
import com.caramm.textextractor.feature.pager.screen.CreateDocumentScreen
import com.caramm.textextractor.feature.pager.screen.FilesScreen
import com.caramm.textextractor.ui.theme.TextExtractorTheme

@Composable
fun PagerScreen(navController: NavHostController) {
    val pagerState = rememberPagerState { 2 }

    Column {
        TextExtractorTopBar(
            modifier = Modifier.fillMaxWidth(),
            actions = {
                ThemeSwitchButton()

                TextExtractorIconButton(
                    onClick = {},
                    imageVector = Icons.Default.MoreVert,
                )
            },
            color = TextExtractorTheme.colors.text
        )

        SubTitleTopBar(
            title = if (pagerState.currentPage == 0) "문서 생성" else "파일 경로",
            modifier = Modifier.fillMaxWidth()
        )

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { currentPage ->
            when (currentPage) {
                0 -> CreateDocumentScreen { navController.navigateToModifyFile(it) }
                1 -> FilesScreen { navController.navigateToModifyFile(it) }
            }
        }
    }
}
