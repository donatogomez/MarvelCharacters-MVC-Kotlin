package io.donatogomez.marvelcharactersmvc.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


typealias Characters = ArrayList<Character>

@Parcelize
data class Character(
    var image: String,
    var name: String,
    var description: String,
    var isHeroe: Boolean
) : Parcelable