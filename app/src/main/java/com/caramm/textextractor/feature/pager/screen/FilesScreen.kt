package com.caramm.textextractor.feature.pager.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun FilesScreen(navigateToModifyFile: (String) -> Unit) {
    Column {
        Text("file screen")

        Button(
            onClick = { navigateToModifyFile("file to modify") }
        ) {
            Text("navigate modify file screen")
        }
    }
}