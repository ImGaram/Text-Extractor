package com.caramm.textextractor.feature.permission

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.Settings
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.caramm.textextractor.BuildConfig
import com.caramm.textextractor.R
import com.caramm.textextractor.common.utils.getHeight
import com.caramm.textextractor.core.designsystem.TextExtractorButton
import com.caramm.textextractor.core.designsystem.TextExtractorText
import com.caramm.textextractor.feature.permission.component.PermissionInfo
import com.caramm.textextractor.ui.theme.TextExtractorTheme
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun PermissionScreen(navigateToPager: () -> Unit) {
    val context = LocalContext.current
    val screenHeight = getHeight(context.resources)

    val permissionState = rememberMultiplePermissionsState(
        permissions = if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.Q) {
            listOf(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE,
            )
        } else emptyList()
    )
    val hasPermission = remember { mutableStateOf(false) }
    val manageAllFilesLauncher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        hasPermission.value = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R)
            Environment.isExternalStorageManager()
        else permissionState.allPermissionsGranted
    }

    LaunchedEffect(hasPermission.value, permissionState.allPermissionsGranted) {
        if (hasPermission.value || permissionState.allPermissionsGranted) navigateToPager()
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextExtractorText(
            text = "텍스트 추출기 이용을 위해\n아래 권한을 허용해 주세요.",
            modifier = Modifier.padding(top = (screenHeight * 0.2).dp),
            style = TextExtractorTheme.type.medium18,
            textAlign = TextAlign.Center
        )

        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 32.dp,
                    top = (screenHeight * 0.04).dp,
                    end = 32.dp,
                    bottom = (screenHeight * 0.04).dp
                ),
            color = TextExtractorTheme.colors.gray
        )

        PermissionInfo(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 48.dp),
            iconVector = ImageVector.vectorResource(R.drawable.ic_folder),
            iconTint = TextExtractorTheme.colors.text,
            title = "저장소",
            description = "기기 안에 파일 정보를 불러와 파일 생성 및 파일을 읽고, 쓰기 위해 저장소 권한이 필요합니다."
        )

        Spacer(modifier = Modifier.weight(1f))

        TextExtractorButton(
            onClick = {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    val intent = Intent().apply {
                        action = Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION
                        data = Uri.parse("package:${BuildConfig.APPLICATION_ID}")
                    }
                    manageAllFilesLauncher.launch(intent)
                } else {
                    permissionState.launchMultiplePermissionRequest()
                }
            },
            modifier = Modifier.fillMaxWidth(),
            text = "권한 허용하기",
            shape = RectangleShape,
            containerColor = TextExtractorTheme.colors.yellow
        )
    }
}

@Preview
@Composable
private fun PermissionScreenPreview() {
    PermissionScreen {  }
}