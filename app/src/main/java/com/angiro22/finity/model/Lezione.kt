package com.angiro22.finity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Lezione(
    @StringRes val titoloId: Int,
    val descrizione: String,
    @DrawableRes val copertinaId: Int
)
