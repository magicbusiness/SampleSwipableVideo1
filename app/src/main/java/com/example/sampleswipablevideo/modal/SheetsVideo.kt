package com.example.sampleswipablevideo.modal

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SheetsVideo(
    var videoUrl: String = "",
    var title: String = "",
    var desc: String = ""
): Parcelable
