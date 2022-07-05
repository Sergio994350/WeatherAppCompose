package com.sergio994350.weatherappcompose.domain.repository

import com.sergio994350.weatherappcompose.domain.util.Resource
import com.sergio994350.weatherappcompose.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}