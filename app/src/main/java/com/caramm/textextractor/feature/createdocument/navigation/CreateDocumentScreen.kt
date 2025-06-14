package com.caramm.textextractor.feature.createdocument.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.caramm.textextractor.common.navigation.Route
import com.caramm.textextractor.feature.createdocument.CreateDocumentScreen

fun NavController.navigateToCreateDocument() {
    navigate(Route.CreateDocument)
}

fun NavGraphBuilder.createDocumentNavGraph() {
    composable<Route.CreateDocument> {
        CreateDocumentScreen()
    }
}