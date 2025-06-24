package com.example.flightsearch

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "airport")
data class Airport(
    @PrimaryKey val id: Int,
    val iata_code: String,
    val name: String,
    val passengers: Int
)

@Entity(tableName = "favorite")
data class Favorite(
    @PrimaryKey val id: Int,
    val departure_code: String,
    val destination_code: String
)
