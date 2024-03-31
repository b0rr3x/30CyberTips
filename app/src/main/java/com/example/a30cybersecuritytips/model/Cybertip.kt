package com.example.a30cybersecuritytips.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cybertip(
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)


