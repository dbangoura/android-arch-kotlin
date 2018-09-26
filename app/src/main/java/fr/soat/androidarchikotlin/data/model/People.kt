package fr.soat.androidarchikotlin.data.model

import com.google.gson.annotations.SerializedName

class PeopleListResult (val count: String, val results: List<SimplifiedPeople>)

class SimplifiedPeople (val name: String, val url : String) {
    val id: Int
    get() {
        val idStr = url.removeSurrounding("https://swapi.co/api/people/", "/")
        return idStr.toInt()
    }
}

class People (val name:String, val height: String, val mass: String,
              @field:SerializedName("hair_color") val hairColor: String,
              @field:SerializedName("skin_color")val skinColor: String,
              @field:SerializedName("eye_color")val eyeColor: String, val gender: String, val url: String, val films: List<String>)