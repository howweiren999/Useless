package com.example.useless

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "useful")
class Useful(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String,
    val age: Int

)
