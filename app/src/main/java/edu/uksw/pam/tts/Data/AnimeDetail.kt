package edu.uksw.pam.tts.Data

import android.icu.text.CaseMap.Title
import java.io.Serializable
data class AnimeDetail(
    val id: Int,
    val title: String,
    val AnimeImageId: Int = 0,
    val Season: String,
    val Status: String,
    val totalEpisode: String,
    val AnimeDesc: String
):Serializable
