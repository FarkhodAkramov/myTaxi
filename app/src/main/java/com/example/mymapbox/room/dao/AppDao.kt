package com.example.mymapbox.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.mymapbox.models.Location

@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
  suspend  fun addLocation(location: Location)
}