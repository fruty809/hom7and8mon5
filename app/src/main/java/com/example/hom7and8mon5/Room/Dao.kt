package com.example.hom7and8mon5.Room

import androidx.room.Insert
import androidx.room.Query
import com.example.hom7and8mon5.remote.LoveModel

@androidx.room.Dao
interface Dao {
    @Insert

    fun insert(loveModel: LoveModel)


    @Query("SELECT * FROM  love_model")
    fun getAll():List<LoveModel>

    @Query("SELECT * FROM  love_model ORDER BY firstName ASC")
    fun getAllData():List<LoveModel>
}