package com.sergio994350.weatherappcompose.data.repository

import com.sergio994350.weatherappcompose.data.mappers.toWeatherInfo
import com.sergio994350.weatherappcompose.data.remote.WeatherApi
import com.sergio994350.weatherappcompose.domain.repository.WeatherRepository
import com.sergio994350.weatherappcompose.domain.util.Resource
import com.sergio994350.weatherappcompose.domain.weather.WeatherInfo
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "Unknown Error")
        }
    }
}