package com.caramm.textextractor.feature.modifyfile.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.caramm.textextractor.common.navigation.Route
import com.caramm.textextractor.feature.modifyfile.ModifyFileScreen

fun NavController.navigateToModifyFile(ocrRes: String) {
    navigate(Route.ModifyFile(ocrRes))
}

fun NavGraphBuilder.modifyFileNavGraph() {
    composable<Route.ModifyFile> { navBackStackEntry ->
        val ocrRes = navBackStackEntry.toRoute<Route.ModifyFile>().ocrRes
        ModifyFileScreen(ocrRes = ocrRes)
    }
}