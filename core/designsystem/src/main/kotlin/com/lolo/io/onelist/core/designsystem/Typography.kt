package com.lolo.io.onelist.core.designsystem

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

private val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

private fun googleFontFamily(name: String): FontFamily {
    val font = GoogleFont(name)
    return FontFamily(
        Font(googleFont = font, fontProvider = provider, weight = FontWeight.Normal),
        Font(googleFont = font, fontProvider = provider, weight = FontWeight.Bold),
        Font(googleFont = font, fontProvider = provider, style = FontStyle.Italic),
    )
}

fun resolveFontFamily(fontPref: String): FontFamily = when (fontPref) {
    "roboto"      -> googleFontFamily("Roboto")
    "lato"        -> googleFontFamily("Lato")
    "opensans"    -> googleFontFamily("Open Sans")
    "montserrat"  -> googleFontFamily("Montserrat")
    "raleway"     -> googleFontFamily("Raleway")
    else          -> FontFamily.Default
}

fun resolveFontSize(sizePref: String) = when (sizePref) {
    "small"  -> 13.sp
    "large"  -> 20.sp
    else     -> 16.sp // medium
}

fun resolveCommentFontSize(sizePref: String) = when (sizePref) {
    "small"  -> 10.sp
    "large"  -> 15.sp
    else     -> 12.sp
}

@Composable
fun typography(fontFamily: FontFamily = FontFamily.Default, fontSize: Float = 16f) = Typography(
    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = fontSize.sp,
        lineHeight = (fontSize * 1.5f).sp,
        letterSpacing = 0.5.sp
    ),
)

val Typography.app: AppTypography
    @Composable get() = appTypography()

data class AppTypography(
    val itemTitle: TextStyle,
    val itemComment: TextStyle,
    val itemTitleDone: TextStyle,
    val itemCommentDone: TextStyle,
)

@Composable
fun appTypography(): AppTypography {
    val itemComment = TextStyle(
        fontFamily = MaterialTheme.typography.bodyLarge.fontFamily ?: FontFamily.Default,
        fontStyle = FontStyle.Italic,
        fontSize = MaterialTheme.typography.bodyLarge.fontSize * 0.75f,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

    return AppTypography(
        itemTitle = MaterialTheme.typography.bodyLarge,
        itemComment = itemComment,
        itemTitleDone = MaterialTheme.typography.bodyLarge.copy(
            textDecoration = TextDecoration.LineThrough
        ),
        itemCommentDone = itemComment.copy(
            textDecoration = TextDecoration.LineThrough
        ),
    )
}
