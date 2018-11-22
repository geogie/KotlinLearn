package com.example.george.kotlinlearn.domain.commands

import com.example.george.kotlinlearn.domain.datasource.ForecastProvider
import com.example.george.kotlinlearn.domain.model.ForecastList

class RequestForecastCommand (
    private val zipCode: Long,
    private val forecastProvider: ForecastProvider = ForecastProvider()):
        Command<ForecastList>{

    override fun execute()= forecastProvider.requestByZipCode(zipCode, DAYS)

    companion object {
        const val DAYS = 7
    }

}