package com.app.roomdatabase.DB

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao //bach n3rfo il room ili hatha data acces object

interface DAO {  //method for access to the table
    @Insert
    suspend  fun insertNote (post: NotesEntity)

    @Delete
    suspend fun deleteNote(post: NotesEntity)
    @Update
    suspend fun updateNote(post: NotesEntity)

    @Query("SELECT * FROM `Notes_table` ORDER BY id DESC")
    fun getAllNotes(): Flow<List<NotesEntity>> //Flow is used to hold values that can always change at runtime is to collect
    // with flow all u need is to collect the value from the variable  and method without need to repeat codes to update the user interface
    //Return a flow list de type of posts
    @Query("SELECT * FROM `notes_table` where id=:id ")
    fun fetchNote(id:Int):Flow<NotesEntity>

}