package com.sergio994350.weatherappcompose.di

import com.sergio994350.weatherappcompose.data.location.DefaultLocationTracker
import com.sergio994350.weatherappcompose.data.repository.WeatherRepositoryImpl
import com.sergio994350.weatherappcompose.domain.location.LocationTracker
import com.sergio994350.weatherappcompose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}