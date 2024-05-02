package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object GameDate {
    private  var gameModel :MutableLiveData<GameModel> = MutableLiveData()
    var gameModel : LiveData<GameModel> = gameModel

}