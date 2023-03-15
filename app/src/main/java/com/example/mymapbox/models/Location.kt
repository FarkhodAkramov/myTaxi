package com.example.mymapbox.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Location")
data class Location(
    @PrimaryKey(autoGenerate = true)
    val idn: Int=0,
    val lat: Double,
    val lang: Double
)