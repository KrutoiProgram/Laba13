package com.bignerdranch.android.labs11.data.model

import android.provider.BaseColumns
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bignerdranch.android.labs11.data.WEATHER_TABLE
import java.util.*

@Entity(tableName = WEATHER_TABLE)
class WeatherTable(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = BaseColumns._ID)
    val id:Int,
    @ColumnInfo(index = true)
    var weatherId:Int = 0,
    var date: Date = Date(),
    var Daytime_Temperature: Int,
    var NightTemp: Int


)

