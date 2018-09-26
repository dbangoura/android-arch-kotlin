package fr.soat.androidarchikotlin.data.repository

import fr.soat.androidarchikotlin.data.model.PeopleListResult
import retrofit2.Callback

interface PeopleRepository {
    fun getPeopleAtPage(page: Int, callback: Callback<PeopleListResult>)
}