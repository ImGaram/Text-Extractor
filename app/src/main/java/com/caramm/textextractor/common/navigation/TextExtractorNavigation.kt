package com.caramm.textextractor.common.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.caramm.textextractor.feature.modifyfile.navigation.modifyFileNavGraph
import com.caramm.textextractor.feature.pager.navigation.navigateToPager
import com.caramm.textextractor.feature.pager.navigation.pagerNavGraph
import com.caramm.textextractor.feature.permission.navigation.permissionNavGraph

@Composable
fun TextExtractorNavigation(
    navController: NavHostController,
    startDestination: Route = Route.Permission
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        permissionNavGraph { navController.navigateToPager() }

        pagerNavGraph(navController)

        modifyFileNavGraph()
    }
}