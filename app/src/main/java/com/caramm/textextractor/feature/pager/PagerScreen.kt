package com.caramm.textextractor.feature.pager

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.caramm.textextractor.feature.modifyfile.navigation.navigateToModifyFile
import com.caramm.textextractor.feature.pager.screen.CreateDocumentScreen
import com.caramm.textextractor.feature.pager.screen.FilesScreen

@Composable
fun PagerScreen(navController: NavHostController) {
    val pagerState = rememberPagerState { 2 }

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
