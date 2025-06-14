package com.caramm.textextractor.common.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.caramm.textextractor.feature.createdocument.navigation.createDocumentNavGraph
import com.caramm.textextractor.feature.files.navigation.filesNavGraph
import com.caramm.textextractor.feature.modifyfile.navigation.modifyFileNavGraph
import com.caramm.textextractor.feature.permission.navigation.permissionNavGraph

@Composable
fun TextExtractorNavigation(
    navController: NavHostController,
    startDestination: Route
) {
    // navigate 구조
    // 시작: permission(권한 업을 때만), files(기본)
    // 경로: files <-> createDocument     (horizontal pager로 이동)
    // files -> modifyFile(파일을 수정할 경우)
    // createDocument -> modifyFile(이미지를 스캔한 경우)
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        permissionNavGraph()

        filesNavGraph()

        createDocumentNavGraph()

        modifyFileNavGraph()
    }
}