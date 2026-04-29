package com.lolo.io.onelist.core.designsystem.colors

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import com.lolo.io.onelist.core.designsystem.Palette
import androidx.compose.material3.darkColorScheme as materialDarkColorScheme

@Composable
fun darkColorScheme(): ColorScheme = materialDarkColorScheme(
    primary = Palette.NAVY_LIGHT,
    onPrimary = Palette.PURE_WHITE,
    secondary = Palette.NAVY_LIGHT,
    tertiary = Palette.NAVY,
    background = Palette.PURE_BLACK,
    error = Palette.NAVY_LIGHT,
    outline = Palette.GRAY,
    outlineVariant = Palette.GRAY_DARK,
    surfaceContainer = Palette.NAVY_DARK,
)
