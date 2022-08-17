package com.example.myapp

import android.app.Application
import com.example.myapp.database.UserDatabase

class UserApp : Application() {

    val database : UserDatabase by lazy { UserDatabase.getDatabase(this) }

}