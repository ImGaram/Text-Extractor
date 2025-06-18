package com.caramm.textextractor.feature.permission.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.caramm.textextractor.common.navigation.Route
import com.caramm.textextractor.feature.permission.PermissionScreen

fun NavController.navigateToPermission() {
    navigate(Route.Permission)
}

fun NavGraphBuilder.permissionNavGraph(navigateToPager: () -> Unit) {
    composable<Route.Permission> {
        PermissionScreen(navigateToPager)
    }
}