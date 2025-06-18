package com.caramm.textextractor.feature.pager.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CreateDocumentScreen(navigateToModifyFile: (String) -> Unit) {
    Column {
        Text("create document screen")

        Button(
            onClick = { navigateToModifyFile("create document to modify") }
        ) {
            Text("navigate modify file screen")
        }
    }
}