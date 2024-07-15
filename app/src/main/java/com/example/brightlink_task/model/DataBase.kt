package com.example.brightlink_task.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.brightlink_task.dao.Dao

@Database(
    entities = [Task::class],
    version = 1,
    exportSchema = false
)
// @TypeConverters(TypeConverter::class)
abstract class DataBase : RoomDatabase() {

    abstract val dao : Dao

    companion object {
        @Volatile
        private var INSTANCE: DataBase? = null
        fun getInstance(context: Context): DataBase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    DataBase::class.java,
                    "task_db"
                ).build().also {
                    INSTANCE = it
                }
            }

        }
    }

}