package com.example.mobile_tp6.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mobile_tp6.database.dao.MovieDao
import com.example.mobile_tp6.database.entity.MovieEntity

@Database(
    entities = [MovieEntity::class], version = 1
)
abstract class MoviesRoomDatabase: RoomDatabase() {
    abstract fun movieDao() : MovieDao
}