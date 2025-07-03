package com.caramm.textextractor.core.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.caramm.textextractor.common.constant.PREFERENCES_NAME
import com.caramm.textextractor.common.constant.THEME_PREFERENCES_KEY
import com.caramm.textextractor.core.domain.repository.ThemeRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(PREFERENCES_NAME)

class ThemeRepositoryImpl @Inject constructor(
    @ApplicationContext private val context: Context
): ThemeRepository {

    private companion object {
        // dark = true, light = false
        val THEME_PREFERENCES = booleanPreferencesKey(THEME_PREFERENCES_KEY)
    }

    override suspend fun getIsDarkTheme(): Flow<Boolean> =
        context.dataStore.data.map { it[THEME_PREFERENCES] ?: false }

    override suspend fun updateTheme(value: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[THEME_PREFERENCES] = value
        }
    }
}