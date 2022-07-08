package com.sergio994350.weatherappcompose.domain.weather

import androidx.annotation.DrawableRes
import com.sergio994350.weatherappcompose.R

sealed class WeatherType(
    val weatherDesc: String,
    @DrawableRes val iconRes: Int
) {
    object ClearSky : WeatherType(
        weatherDesc = "Чистое небо",
        iconRes = R.drawable.ic_sunny
    )
    object MainlyClear : WeatherType(
        weatherDesc = "Преимущественно ясно",
        iconRes = R.drawable.ic_cloudy
    )
    object PartlyCloudy : WeatherType(
        weatherDesc = "Переменная облачность",
        iconRes = R.drawable.ic_cloudy
    )
    object Overcast : WeatherType(
        weatherDesc = "Пасмурно",
        iconRes = R.drawable.ic_cloudy
    )
    object Foggy : WeatherType(
        weatherDesc = "Туманно",
        iconRes = R.drawable.ic_very_cloudy
    )
    object DepositingRimeFog : WeatherType(
        weatherDesc = "Туман с инеем",
        iconRes = R.drawable.ic_very_cloudy
    )
    object LightDrizzle : WeatherType(
        weatherDesc = "Легкий моросящий дождь",
        iconRes = R.drawable.ic_rainshower
    )
    object ModerateDrizzle : WeatherType(
        weatherDesc = "Умеренный моросящий дождь",
        iconRes = R.drawable.ic_rainshower
    )
    object DenseDrizzle : WeatherType(
        weatherDesc = "Густой моросящий дождь",
        iconRes = R.drawable.ic_rainshower
    )
    object LightFreezingDrizzle : WeatherType(
        weatherDesc = "Небольшой моросящий дождь",
        iconRes = R.drawable.ic_snowyrainy
    )
    object DenseFreezingDrizzle : WeatherType(
        weatherDesc = "Густой моросящий дождь",
        iconRes = R.drawable.ic_snowyrainy
    )
    object SlightRain : WeatherType(
        weatherDesc = "Небольшой дождь",
        iconRes = R.drawable.ic_rainy
    )
    object ModerateRain : WeatherType(
        weatherDesc = "Дождливый",
        iconRes = R.drawable.ic_rainy
    )
    object HeavyRain : WeatherType(
        weatherDesc = "Сильный дождь",
        iconRes = R.drawable.ic_rainy
    )
    object HeavyFreezingRain: WeatherType(
        weatherDesc = "Сильный ледяной дождь",
        iconRes = R.drawable.ic_snowyrainy
    )
    object SlightSnowFall: WeatherType(
        weatherDesc = "Небольшой снегопад",
        iconRes = R.drawable.ic_snowy
    )
    object ModerateSnowFall: WeatherType(
        weatherDesc = "Умеренный снегопад",
        iconRes = R.drawable.ic_heavysnow
    )
    object HeavySnowFall: WeatherType(
        weatherDesc = "Сильный снегопад",
        iconRes = R.drawable.ic_heavysnow
    )
    object SnowGrains: WeatherType(
        weatherDesc = "Снежная крупа",
        iconRes = R.drawable.ic_heavysnow
    )
    object SlightRainShowers: WeatherType(
        weatherDesc = "Небольшой дождь",
        iconRes = R.drawable.ic_rainshower
    )
    object ModerateRainShowers: WeatherType(
        weatherDesc = "Умеренный дождь",
        iconRes = R.drawable.ic_rainshower
    )
    object ViolentRainShowers: WeatherType(
        weatherDesc = "Сильный дождь",
        iconRes = R.drawable.ic_rainshower
    )
    object SlightSnowShowers: WeatherType(
        weatherDesc = "Небольшой снег с дождем",
        iconRes = R.drawable.ic_snowy
    )
    object HeavySnowShowers: WeatherType(
        weatherDesc = "Сильный снег с дождем",
        iconRes = R.drawable.ic_snowy
    )
    object ModerateThunderstorm: WeatherType(
        weatherDesc = "Умеренная гроза",
        iconRes = R.drawable.ic_thunder
    )
    object SlightHailThunderstorm: WeatherType(
        weatherDesc = "Гроза с небольшим градом",
        iconRes = R.drawable.ic_rainythunder
    )
    object HeavyHailThunderstorm: WeatherType(
        weatherDesc = "Гроза с сильным градом",
        iconRes = R.drawable.ic_rainythunder
    )

//sealed class WeatherType(
//    val weatherDesc: String,
//    @DrawableRes val iconRes: Int
//) {
//    object ClearSky : WeatherType(
//        weatherDesc = "Clear sky",
//        iconRes = R.drawable.ic_sunny
//    )
//    object MainlyClear : WeatherType(
//        weatherDesc = "Mainly clear",
//        iconRes = R.drawable.ic_cloudy
//    )
//    object PartlyCloudy : WeatherType(
//        weatherDesc = "Partly cloudy",
//        iconRes = R.drawable.ic_cloudy
//    )
//    object Overcast : WeatherType(
//        weatherDesc = "Overcast",
//        iconRes = R.drawable.ic_cloudy
//    )
//    object Foggy : WeatherType(
//        weatherDesc = "Foggy",
//        iconRes = R.drawable.ic_very_cloudy
//    )
//    object DepositingRimeFog : WeatherType(
//        weatherDesc = "Depositing rime fog",
//        iconRes = R.drawable.ic_very_cloudy
//    )
//    object LightDrizzle : WeatherType(
//        weatherDesc = "Light drizzle",
//        iconRes = R.drawable.ic_rainshower
//    )
//    object ModerateDrizzle : WeatherType(
//        weatherDesc = "Moderate drizzle",
//        iconRes = R.drawable.ic_rainshower
//    )
//    object DenseDrizzle : WeatherType(
//        weatherDesc = "Dense drizzle",
//        iconRes = R.drawable.ic_rainshower
//    )
//    object LightFreezingDrizzle : WeatherType(
//        weatherDesc = "Slight freezing drizzle",
//        iconRes = R.drawable.ic_snowyrainy
//    )
//    object DenseFreezingDrizzle : WeatherType(
//        weatherDesc = "Dense freezing drizzle",
//        iconRes = R.drawable.ic_snowyrainy
//    )
//    object SlightRain : WeatherType(
//        weatherDesc = "Slight rain",
//        iconRes = R.drawable.ic_rainy
//    )
//    object ModerateRain : WeatherType(
//        weatherDesc = "Rainy",
//        iconRes = R.drawable.ic_rainy
//    )
//    object HeavyRain : WeatherType(
//        weatherDesc = "Heavy rain",
//        iconRes = R.drawable.ic_rainy
//    )
//    object HeavyFreezingRain: WeatherType(
//        weatherDesc = "Heavy freezing rain",
//        iconRes = R.drawable.ic_snowyrainy
//    )
//    object SlightSnowFall: WeatherType(
//        weatherDesc = "Slight snow fall",
//        iconRes = R.drawable.ic_snowy
//    )
//    object ModerateSnowFall: WeatherType(
//        weatherDesc = "Moderate snow fall",
//        iconRes = R.drawable.ic_heavysnow
//    )
//    object HeavySnowFall: WeatherType(
//        weatherDesc = "Heavy snow fall",
//        iconRes = R.drawable.ic_heavysnow
//    )
//    object SnowGrains: WeatherType(
//        weatherDesc = "Snow grains",
//        iconRes = R.drawable.ic_heavysnow
//    )
//    object SlightRainShowers: WeatherType(
//        weatherDesc = "Slight rain showers",
//        iconRes = R.drawable.ic_rainshower
//    )
//    object ModerateRainShowers: WeatherType(
//        weatherDesc = "Moderate rain showers",
//        iconRes = R.drawable.ic_rainshower
//    )
//    object ViolentRainShowers: WeatherType(
//        weatherDesc = "Violent rain showers",
//        iconRes = R.drawable.ic_rainshower
//    )
//    object SlightSnowShowers: WeatherType(
//        weatherDesc = "Light snow showers",
//        iconRes = R.drawable.ic_snowy
//    )
//    object HeavySnowShowers: WeatherType(
//        weatherDesc = "Heavy snow showers",
//        iconRes = R.drawable.ic_snowy
//    )
//    object ModerateThunderstorm: WeatherType(
//        weatherDesc = "Moderate thunderstorm",
//        iconRes = R.drawable.ic_thunder
//    )
//    object SlightHailThunderstorm: WeatherType(
//        weatherDesc = "Thunderstorm with slight hail",
//        iconRes = R.drawable.ic_rainythunder
//    )
//    object HeavyHailThunderstorm: WeatherType(
//        weatherDesc = "Thunderstorm with heavy hail",
//        iconRes = R.drawable.ic_rainythunder
//    )

    companion object {
        fun fromWMO(code: Int): WeatherType {
            return when(code) {
                0 -> ClearSky
                1 -> MainlyClear
                2 -> PartlyCloudy
                3 -> Overcast
                45 -> Foggy
                48 -> DepositingRimeFog
                51 -> LightDrizzle
                53 -> ModerateDrizzle
                55 -> DenseDrizzle
                56 -> LightFreezingDrizzle
                57 -> DenseFreezingDrizzle
                61 -> SlightRain
                63 -> ModerateRain
                65 -> HeavyRain
                66 -> LightFreezingDrizzle
                67 -> HeavyFreezingRain
                71 -> SlightSnowFall
                73 -> ModerateSnowFall
                75 -> HeavySnowFall
                77 -> SnowGrains
                80 -> SlightRainShowers
                81 -> ModerateRainShowers
                82 -> ViolentRainShowers
                85 -> SlightSnowShowers
                86 -> HeavySnowShowers
                95 -> ModerateThunderstorm
                96 -> SlightHailThunderstorm
                99 -> HeavyHailThunderstorm
                else -> ClearSky
            }
        }
    }
}
