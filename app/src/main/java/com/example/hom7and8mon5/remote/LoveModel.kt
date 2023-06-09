package com.example.hom7and8mon5.remote

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "love_model")
data class LoveModel (
    @SerializedName("fname")
    var firstName: String,
    @SerializedName("sname")
    var secondName:String,
    var percentage: String,
    var result:  String,
    @PrimaryKey(autoGenerate = true)
    var id:Int? = 0
): java.io.Serializable
