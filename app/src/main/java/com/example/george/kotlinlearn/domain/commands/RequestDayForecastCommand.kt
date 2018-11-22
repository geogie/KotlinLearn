package com.example.george.kotlinlearn.domain.commands

import com.example.george.kotlinlearn.domain.datasource.ForecastProvider
import com.example.george.kotlinlearn.domain.model.Forecast

/**
 * Created By George
 * Description:
 */
class RequestDayForecastCommand(
        val id: Long,
        private val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<Forecast> {
    override fun execute() = forecastProvider.requrestForecast(id)
}