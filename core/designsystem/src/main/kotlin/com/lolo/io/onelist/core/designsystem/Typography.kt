package com.lolo.io.onelist.core.designsystem

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

val RobotoFamily = FontFamily(Font(R.font.roboto_regular, FontWeight.Normal))
val LatoFamily = FontFamily(Font(R.font.lato_regular, FontWeight.Normal))
val OpenSansFamily = FontFamily(Font(R.font.opensans_regular, FontWeight.Normal))
val MontserratFamily = FontFamily(Font(R.font.montserrat_regular, FontWeight.Normal))
val RalewayFamily = FontFamily(Font(R.font.raleway_regular, FontWeight.Normal))

fun resolveFontFamily(fontPref: String): FontFamily = when (fontPref) {
    "roboto"     -> RobotoFamily
    "lato"       -> LatoFamily
    "opensans"   -> OpenSansFamily
    "montserrat" -> MontserratFamily
    "raleway"    -> RalewayFamily
    else         -> FontFamily.Default
}

fun resolveFontSize(sizePref: String) = when (sizePref) {
    "small" -> 13.sp
    "large" -> 20.sp
    else    -> 16.sp
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
        itemTitleDone = MaterialTheme.typography.bodyLarge.copy(textDecoration = TextDecoration.LineThrough),
        itemCommentDone = itemComment.copy(textDecoration = TextDecoration.LineThrough),
    )
}
