package com.caramm.textextractor.core.persentation.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

data class TextExtractorType(
    val bold20: TextStyle = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    val medium20: TextStyle = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    val normal20: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    val medium18: TextStyle = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    val normal18: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    val medium16: TextStyle = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    val normal16: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    val medium14: TextStyle = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    val normal14: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    val normal12: TextStyle = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    val light12: TextStyle = TextStyle(
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    )
)