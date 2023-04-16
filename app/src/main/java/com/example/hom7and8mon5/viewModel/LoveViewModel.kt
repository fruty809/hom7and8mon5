package com.example.hom7and8mon5.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.hom7and8mon5.remote.LoveModel
import com.example.hom7and8mon5.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoveViewModel @Inject constructor(val repository: Repository)     : ViewModel() {
    fun getLiveLove(firstname: String, secondName:String): LiveData<LoveModel> {
        return  repository.getLove(firstname, secondName)
    }


}