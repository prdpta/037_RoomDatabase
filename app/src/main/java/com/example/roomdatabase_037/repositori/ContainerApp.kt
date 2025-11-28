package com.example.roomdatabase_037.repositori

import android.app.Application
import android.content.Context
import com.example.roomdatabase_037.room.DatabaseSiswa

interface ContainerApp {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataApp(private val context: Context):
