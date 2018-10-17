package com.dota2.heroes.entities

import android.arch.persistence.room.Entity
import com.dota2.heroes.enums.HeroAttribute

@Entity(tableName="heroes")
class Hero(
    val id: Int,
    val name: String,
    val thumb: String,
    val image: String,
    val ban: Int,
    val pick: Int,
    val win: Int,
    val primaryAttribute: HeroAttribute
) {
    var isFavorite: Boolean = false
}