package fr.soat.androidarchikotlin.data.repository

import fr.soat.androidarchikotlin.data.model.People
import fr.soat.androidarchikotlin.data.model.PeopleListResult
import fr.soat.androidarchikotlin.data.repository.network.PeopleService
import retrofit2.Callback

class PeopleRepositoryImpl : PeopleRepository {
    override fun getPeopleAtPage(page: Int, callback: Callback<PeopleListResult>) {
        PeopleService.peopleApi.getPeopleAtPage(page).enqueue(callback)
    }

    override fun getPeopleWithId(id: Int, callback: Callback<People>) {
        PeopleService.peopleApi.getPeopleWithId(id).enqueue(callback)
    }

}