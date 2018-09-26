package fr.soat.androidarchikotlin.data.repository.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val SWAPI_BASE_URL = "https://swapi.co/api/"

object PeopleService {
    val peopleApi: PeopleApi
        get() = Retrofit.Builder()
                .baseUrl(SWAPI_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PeopleApi::class.java)
}