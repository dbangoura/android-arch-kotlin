package fr.soat.androidarchikotlin.features.people_detail

import fr.soat.androidarchikotlin.data.model.People
import fr.soat.androidarchikotlin.data.repository.PeopleRepository
import fr.soat.androidarchikotlin.features.base.BaseInteractor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PeopleDetailInteractor(peopleRepository: PeopleRepository) : BaseInteractor(peopleRepository) {
    fun getPeopleDetail(peopleId: Int, callback: PeopleDetailCallback) {
        peopleRepository.getPeopleWithId(peopleId, object: Callback<People> {

            override fun onResponse(call: Call<People>, response: Response<People>) {
                if(response?.isSuccessful) callback.onPeopleDetailSuccess(response?.body()!!)
                else callback.onPeopleDetailError(response?.errorBody()?.toString())
            }

            override fun onFailure(call: Call<People>, t: Throwable) {
                callback.onPeopleDetailError(t.message)
            }

        })
    }

    interface PeopleDetailCallback {
        fun onPeopleDetailSuccess(people: People)
        fun onPeopleDetailError(error: String?)
    }
}