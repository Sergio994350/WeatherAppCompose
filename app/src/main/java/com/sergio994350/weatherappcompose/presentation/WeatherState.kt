package com.sergio994350.weatherappcompose.presentation

import com.sergio994350.weatherappcompose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
