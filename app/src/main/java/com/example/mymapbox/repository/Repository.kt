package com.example.mymapbox.repository

import android.content.Context
import com.example.mymapbox.models.Location
import com.example.mymapbox.room.AppDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class Repository {
    companion object {

        var appDatabase: AppDatabase? = null



        fun initializeDB(context: Context): AppDatabase {
            return AppDatabase.getLocation(context)
        }

        fun insertData(context: Context, location: Location) {

            appDatabase = initializeDB(context)

            CoroutineScope(IO).launch {

                appDatabase!!.appDao().addLocation(location)
            }

        }
    }
}