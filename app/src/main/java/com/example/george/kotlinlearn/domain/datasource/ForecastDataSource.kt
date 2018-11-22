package com.example.george.kotlinlearn.domain.datasource

import com.example.george.kotlinlearn.domain.model.Forecast
import com.example.george.kotlinlearn.domain.model.ForecastList

interface ForecastDataSource {
    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

    fun requestDayForecast(id: Long): Forecast?
}