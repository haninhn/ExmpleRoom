package com.app.roomdatabase.DB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "Notes_table")  //Entity is for change the class to table
data class NotesEntity(
    @PrimaryKey(autoGenerate = true) val id: Int=0,
    @ColumnInfo(name = "Title") val title : String="",
    @ColumnInfo(name = "Body") val Body :String="",
)
