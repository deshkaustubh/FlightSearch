package com.example.flightsearch

import androidx.room.Query

// FlightDao.kt -> Data Access Object for Flight-related database operations
// since we are only showing all the flights !
interface FlightDao {
    @Query("SELECT * FROM airport")
    suspend fun getAllAirports(): List<Airport>
}