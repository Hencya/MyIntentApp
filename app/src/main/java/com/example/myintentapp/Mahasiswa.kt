package com.example.myintentapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// example use kotlin parcelize library
@Parcelize
data class Mahasiswa(
    val name: String?,
    val nim: String?,
    val kelas: String?,
) : Parcelable