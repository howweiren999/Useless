package com.example.useless

import androidx.lifecycle.LiveData

class UsefulRepository (private val usefulDAO: UsefulDAO){
    //Maintains a copy of the LiveData
    val allUseful : LiveData<List<Useful>> = usefulDAO.getAllUseful()

    //A function to insert useful record
    suspend fun insertUseful(useful: Useful){
        usefulDAO.insertUseful(useful)
    }
}