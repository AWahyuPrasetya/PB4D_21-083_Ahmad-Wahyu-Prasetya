package com.example.praktikumm_modul2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Universitas(
    val imgUniversitas: Int,
    val nameUniversitas: String,
    val descUniversitas: String
): Parcelable
