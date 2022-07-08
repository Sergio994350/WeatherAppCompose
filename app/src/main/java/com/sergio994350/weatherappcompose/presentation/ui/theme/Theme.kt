package com.sergio994350.weatherappcompose.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


/* Other default colors to override
background = Color.White,
surface = Color.White,
onPrimary = Color.White,
onSecondary = Color.Black,
onBackground = Color.Black,
onSurface = Color.Black,
*/


@Composable
fun WeatherAppComposeTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}