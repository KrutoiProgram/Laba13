package com.bignerdranch.android.labs11.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bignerdranch.android.labs11.data.model.CitiesTable
import com.bignerdranch.android.labs11.data.model.WeatherTable

@Database(entities = [CitiesTable::class,WeatherTable::class],version = 1)
abstract class WeatherDatabase: RoomDatabase() {
    abstract fun weatherDAO(): WeatherDAO
}