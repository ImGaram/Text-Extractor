package com.caramm.textextractor.feature.permission

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun PermissionScreen(navigateToPager: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("permission screen")

        Button(
            onClick = navigateToPager
        ) {
            Text("navigate pager screen")
        }
    }
}

@Preview
@Composable
private fun PermissionScreenPreview() {
    PermissionScreen {  }
}