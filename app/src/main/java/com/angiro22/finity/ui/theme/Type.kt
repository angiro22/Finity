package com.angiro22.finity.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.angiro22.finity.R

val Inter = FontFamily(
    Font(R.font.inter_18pt_regular),
    Font(R.font.inter_28pt_regular),
    Font(R.font.inter_18pt_bold),
    Font(R.font.inter_28pt_bold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = Inter,
        fontSize = 28.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = Inter,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
    ),
)