package com.tfmdev.contatinhos

import android.app.Application
import com.tfmdev.contatinhos.data.ContactRepository
import com.tfmdev.contatinhos.data.local.ContactRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class ContatinhosApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { ContactRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { ContactRepository(database.contactDao()) }

}