package com.caramm.textextractor

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.rememberNavController
import com.caramm.textextractor.common.navigation.TextExtractorNavigation
import com.caramm.textextractor.ui.theme.TextExtractorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TextExtractorTheme {
                val navController = rememberNavController()

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    window.isNavigationBarContrastEnforced = false
                } else {
                    window.navigationBarColor = TextExtractorTheme.colors.background.toArgb()
                }

                TextExtractorNavigation(
                    navController = navController,
//                    startDestination = ,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(TextExtractorTheme.colors.background)
                        .navigationBarsPadding()
                )
            }
        }
    }
}
