package com.sergio994350.weatherappcompose.domain.util

class Constants {
    companion object {
        const val BASE_URL = "https://api.open-meteo.com/"
        const val FORECAST_URL =
            "v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl"
        const val TODAY = "Сегодня"
        const val UNKNOWN_ERROR = "Неизвестная ошибка"
        const val LOCATION_ERROR = "Ошибка позиционирования, проверьте GPS"
    }
}