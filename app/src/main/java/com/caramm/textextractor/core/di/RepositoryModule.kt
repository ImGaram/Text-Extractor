package com.caramm.textextractor.core.di

import com.caramm.textextractor.core.data.repository.ThemeRepositoryImpl
import com.caramm.textextractor.core.domain.repository.ThemeRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun provideThemeRepository(themeRepositoryImpl: ThemeRepositoryImpl): ThemeRepository
}