package com.example.hom7and8mon5.repository

import androidx.lifecycle.MutableLiveData
import com.example.hom7and8mon5.remote.LoveApi
import com.example.hom7and8mon5.remote.LoveModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository  @Inject constructor(val api: LoveApi){
    fun getLove(firstname: String, secondName: String): MutableLiveData<LoveModel> {
        val liveLoveData = MutableLiveData<LoveModel>()
        api.getPercentage(firstname, secondName).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if (response.isSuccessful){
                    liveLoveData.postValue(response.body())
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {

            }

        })
        return liveLoveData
    }


}