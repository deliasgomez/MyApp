package com.example.myapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao  {

    @Query("select * from users where email = :id and  password = :pass")
    fun getByEmailAndPass( id : String , pass : String): User

    @Insert
    fun insert(user: User)

    @Query("select * from users where email = :id")
    fun getById(id: String)
}