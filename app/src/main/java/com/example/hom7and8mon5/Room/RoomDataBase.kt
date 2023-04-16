package com.example.hom7and8mon5.Room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hom7and8mon5.remote.LoveModel

@Database(entities = [LoveModel::class], version = 1)
abstract  class RoomDataBase: RoomDatabase() {
    abstract fun loveDao():Dao
}