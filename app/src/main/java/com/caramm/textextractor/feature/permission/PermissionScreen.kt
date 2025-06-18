package com.caramm.textextractor.feature.permission

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun PermissionScreen(navigateToPager: () -> Unit) {
    Column {
        Text("permission screen")

        Button(
            onClick = navigateToPager
        ) {
            Text("navigate pager screen")
        }
    }
}