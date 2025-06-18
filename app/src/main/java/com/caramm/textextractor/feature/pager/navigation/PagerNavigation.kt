package com.caramm.textextractor.feature.pager.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.caramm.textextractor.common.navigation.Route
import com.caramm.textextractor.feature.pager.PagerScreen

fun NavController.navigateToPager() {
    navigate(Route.Pager)
}

fun NavGraphBuilder.pagerNavGraph(navController: NavHostController) {
    composable<Route.Pager> {
        PagerScreen(navController)
    }
}