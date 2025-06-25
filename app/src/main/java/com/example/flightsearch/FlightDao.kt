package com.example.flightsearch

import androidx.room.Query

// FlightDao.kt -> Data Access Object for Flight-related database operations
// since we are only showing all the flights !
interface FlightDao {
    @Query("SELECT * FROM airport")
    suspend fun getAllAirports(): List<Airport>

    @Query("""
        SELECT * FROM airport
        WHERE name LIKE '%' || :query || '%'
           OR iata_code LIKE '%' || :query || '%'
        ORDER BY passengers DESC
    """)
    suspend fun searchAirports(query: String): List<Airport>
}


