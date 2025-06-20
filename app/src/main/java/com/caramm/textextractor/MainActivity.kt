package com.caramm.textextractor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.ui.Modifier
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

                TextExtractorNavigation(
                    navController = navController,
//                    startDestination = ,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(TextExtractorTheme.colors.background)
                        .statusBarsPadding()
                        .systemBarsPadding()
                )
            }
        }
    }
}
