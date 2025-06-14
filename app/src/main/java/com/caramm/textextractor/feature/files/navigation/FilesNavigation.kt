package com.caramm.textextractor.feature.files.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.caramm.textextractor.common.navigation.Route
import com.caramm.textextractor.feature.files.FilesScreen

fun NavController.navigateToFiles() {
    navigate(Route.Files)
}

fun NavGraphBuilder.filesNavGraph() {
    composable<Route.Files> {
        FilesScreen()
    }
}