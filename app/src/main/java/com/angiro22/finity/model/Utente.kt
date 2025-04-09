package com.angiro22.finity.model

import android.provider.ContactsContract
import javax.security.auth.callback.PasswordCallback

data class Utente(
    val nome: String,
    val cognome: String,
    val username: String,
    val email: ContactsContract.CommonDataKinds.Email,
    val password: PasswordCallback,
)
