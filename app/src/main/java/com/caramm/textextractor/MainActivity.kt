package com.caramm.textextractor

import android.Manifest
import android.os.Build
import android.os.Bundle
import android.os.Environment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.rememberNavController
import com.caramm.textextractor.common.navigation.Route
import com.caramm.textextractor.common.navigation.TextExtractorNavigation
import com.caramm.textextractor.ui.theme.TextExtractorTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPermissionsApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TextExtractorTheme {
                val navController = rememberNavController()
                val permissionState = rememberMultiplePermissionsState(
                    permissions = if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.Q) {
                        listOf(
                            Manifest.permission.WRITE_EXTERNAL_STORAGE,
                            Manifest.permission.READ_EXTERNAL_STORAGE,
                        )
                    } else emptyList()
                )
                val hasPermission = remember {
                    mutableStateOf(
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) Environment.isExternalStorageManager()
                        else permissionState.allPermissionsGranted
                    )
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    window.isNavigationBarContrastEnforced = false
                } else {
                    window.navigationBarColor = TextExtractorTheme.colors.background.toArgb()
                }

                TextExtractorNavigation(
                    navController = navController,
                    startDestination = if (!hasPermission.value) Route.Permission else Route.Pager,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(TextExtractorTheme.colors.background)
                        .statusBarsPadding()
                        .navigationBarsPadding()
                )
            }
        }
    }
}
