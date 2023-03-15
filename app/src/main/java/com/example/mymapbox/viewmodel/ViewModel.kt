package com.example.mymapbox.viewmodel
import android.content.Context
import androidx.lifecycle.ViewModel
import com.example.mymapbox.models.Location
import com.example.mymapbox.repository.Repository

class ViewModel:ViewModel() {


    fun insertData(context: Context, location: Location) {
        Repository.insertData(context,location)
    }
}