package com.kruszyk.weatherapp.api

import com.kruszyk.weatherapp.model.Weather
import com.kruszyk.weatherapp.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather/Luanda")
    suspend fun getWeather(): Response<Weather>

}