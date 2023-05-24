package com.example.deucapstone2023.data.datasource.local.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ObstacleSensor(
    @PrimaryKey val id: Int,
    val status: String,
    val desc: String,
    val date: String
)