package com.udacity.asteroidradar.api

import com.udacity.asteroidradar.models.PictureOfDay
import com.udacity.asteroidradar.util.Constants.API_KEY
import com.udacity.asteroidradar.util.Constants.HTTP_GET_APOD_PATH
import com.udacity.asteroidradar.util.Constants.HTTP_GET_NEO_FEED_PATH
import com.udacity.asteroidradar.util.Constants.QUERY_API_KEY_PARAM
import com.udacity.asteroidradar.util.Constants.QUERY_END_DATE_PARAM
import com.udacity.asteroidradar.util.Constants.QUERY_START_DATE_PARAM
import retrofit2.http.GET
import retrofit2.http.Query

interface AsteroidService {
    @GET(HTTP_GET_NEO_FEED_PATH)
    suspend fun getAsteroids(
        @Query(QUERY_START_DATE_PARAM) startDate: String,
        @Query(QUERY_END_DATE_PARAM) endDate: String,
        @Query(QUERY_API_KEY_PARAM) apiKey: String): String

    @GET(HTTP_GET_APOD_PATH)
    suspend fun getPictureOfDay(@Query(QUERY_API_KEY_PARAM) apiKey: String) : PictureOfDay
}