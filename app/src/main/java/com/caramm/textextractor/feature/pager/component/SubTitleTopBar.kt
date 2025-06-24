package com.caramm.textextractor.feature.pager.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.caramm.textextractor.R
import com.caramm.textextractor.core.designsystem.TextExtractorIcon
import com.caramm.textextractor.core.designsystem.TextExtractorText
import com.caramm.textextractor.ui.theme.TextExtractorTheme

@Composable
fun SubTitleTopBar(
    title: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextExtractorIcon(
            imageVector = ImageVector.vectorResource(R.drawable.ic_folder),
            modifier = Modifier.padding(top = 4.dp, start = 24.dp, bottom = 4.dp, end = 12.dp),
            tint = TextExtractorTheme.colors.text
        )

        TextExtractorText(
            text = title,
            style = TextExtractorTheme.type.normal14
        )
    }
}
