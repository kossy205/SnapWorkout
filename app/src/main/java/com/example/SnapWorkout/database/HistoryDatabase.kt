package com.example.SnapWorkout.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [HistoryEntity::class],version = 1)
abstract class HistoryDatabase:RoomDatabase(){

    abstract fun historyDao(): HistoryDao

    /**
     * Define a companion object, this allows us to add functions on the HistoryDatabase class.
     */
    companion object {

        @Volatile
        private var INSTANCE: HistoryDatabase? = null


        fun getInstance(context: Context): HistoryDatabase {
            synchronized(this) {

               var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        HistoryDatabase::class.java,
                        "history_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                   INSTANCE = instance
                }

                return instance
            }
        }
    }

}