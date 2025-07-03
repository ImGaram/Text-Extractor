package com.caramm.textextractor.feature.permission.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.caramm.textextractor.R
import com.caramm.textextractor.core.designsystem.TextExtractorIcon
import com.caramm.textextractor.core.designsystem.TextExtractorText
import com.caramm.textextractor.core.persentation.ui.theme.TextExtractorTheme

@Composable
fun PermissionInfo(
    modifier: Modifier,
    iconVector: ImageVector,
    title: String,
    description: String
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(TextExtractorTheme.colors.lightBlue)
                .padding(8.dp)
        ) {
            TextExtractorIcon(
                imageVector = iconVector,
                tint = TextExtractorTheme.colors.icon
            )
        }

        Column(modifier = Modifier.padding(top = 4.dp, start = 16.dp, bottom = 4.dp)) {
            TextExtractorText(
                text = title,
                style = TextExtractorTheme.type.medium14
            )

            TextExtractorText(
                text = description,
                modifier = Modifier.padding(top = 4.dp),
                style = TextExtractorTheme.type.normal12
            )
        }
    }
}

@Preview
@Composable
private fun PermissionInfoPreview() {
    PermissionInfo(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        iconVector = ImageVector.vectorResource(R.drawable.ic_folder),
        title = "저장소",
        description = "기기 안에 파일 정보를 불러와 파일 생성 및 파일을 읽고, 쓰기 위해 저장소 권한이 필요합니다."
    )
}
