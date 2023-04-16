package com.example.hom7and8mon5

import android.app.Application
import androidx.room.Room
import com.example.hom7and8mon5.Room.RoomDataBase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application(){
    companion object{
        lateinit var dataBase: RoomDataBase
    }

    override fun onCreate() {
        super.onCreate()
        dataBase = Room.databaseBuilder(applicationContext, RoomDataBase::class.java, "love_table").allowMainThreadQueries().build()
    }
}