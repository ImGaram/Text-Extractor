package com.caramm.textextractor.core.domain.repository

import kotlinx.coroutines.flow.Flow

interface ThemeRepository {

    suspend fun getIsDarkTheme(): Flow<Boolean>

    suspend fun updateTheme(value: Boolean)
}