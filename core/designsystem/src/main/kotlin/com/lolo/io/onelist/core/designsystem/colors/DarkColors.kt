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
    onBackground = Palette.PURE_WHITE,
    surface = Palette.PURE_BLACK,
    onSurface = Palette.PURE_WHITE,
    error = Palette.NAVY_LIGHT,
    outline = Palette.GRAY_DARK,
    outlineVariant = Palette.GRAY_DARK,
    surfaceContainer = Palette.SURFACE_BLACK,
)
