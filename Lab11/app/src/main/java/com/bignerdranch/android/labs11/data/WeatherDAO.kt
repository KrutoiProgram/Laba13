package com.bignerdranch.android.labs11.data

import androidx.room.*
import com.bignerdranch.android.labs11.data.model.CitiesTable
import com.bignerdranch.android.labs11.data.model.WeatherTable

@Dao

interface WeatherDAO {

    @Query("SELECT * FROM $CITIES_TABLE")
    fun getAllCities(): List<CitiesTable>

    @Insert
    fun addCity(citiesTable: CitiesTable)

    @Update
    fun saveCities(citiesTable: CitiesTable)

    @Delete
    fun killCity(citiesTable: CitiesTable)


    @Query("SELECT * FROM $WEATHER_TABLE")
    fun getAllWeather(): List<WeatherTable>

    @Insert
    fun addWeather(weatherTable: WeatherTable)

    @Update
    fun saveWeather(weatherTable: WeatherTable)

    @Delete
    fun killWeather(weatherTable: WeatherTable)




}