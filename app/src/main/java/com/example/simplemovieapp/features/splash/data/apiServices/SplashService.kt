package com.example.simplemovieapp.features.splash.data.apiServices

import com.example.simplemovieapp.features.splash.data.responseDto.ConfigurationDto
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * SplashService
 *
 * @author (c) 2024, Hugo Figueroa
 * */
interface SplashService {
    @GET("configuration")
    fun getConfigurationAsync(@Query("api_key") apiKey: String): Deferred<ConfigurationDto>
}