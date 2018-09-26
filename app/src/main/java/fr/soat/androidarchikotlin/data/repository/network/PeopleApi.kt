package fr.soat.androidarchikotlin.data.repository.network

import fr.soat.androidarchikotlin.data.model.People
import fr.soat.androidarchikotlin.data.model.PeopleListResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PeopleApi {

    @GET("people/")
    fun getPeopleAtPage (@Query("page") page: Int) : Call<PeopleListResult>

    @GET("people/{peopleId}")
    fun getPeopleWithId (@Path("peopleId") peopleId: Int) : Call<People>
}