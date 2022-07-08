package com.sergio994350.weatherappcompose.data.remote

import com.sergio994350.weatherappcompose.domain.util.Constants.Companion.FORECAST_URL
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET(FORECAST_URL)
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto
}