package com.caramm.textextractor.core.persentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.caramm.textextractor.common.utils.Theme
import com.caramm.textextractor.core.domain.repository.ThemeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ThemeViewModel @Inject constructor(
    private val themeRepository: ThemeRepository
): ViewModel() {

    private val isDarkTheme = MutableStateFlow<Boolean?>(null)

    private val _theme = MutableStateFlow(Theme.LIGHT)
    val theme = _theme.asStateFlow()

    init {
        viewModelScope.launch {
            themeRepository.getIsDarkTheme().collectLatest {
                isDarkTheme.value = it
                _theme.value = if (it) Theme.DARK else Theme.LIGHT
            }
        }
    }

    fun updateTheme() {
        viewModelScope.launch {
            if (isDarkTheme.value != null) {
                themeRepository.updateTheme(!isDarkTheme.value!!)
            }
        }
    }
}