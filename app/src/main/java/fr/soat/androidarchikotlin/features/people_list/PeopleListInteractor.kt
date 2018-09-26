package fr.soat.androidarchikotlin.features.people_list

import fr.soat.androidarchikotlin.data.model.PeopleListResult
import fr.soat.androidarchikotlin.data.repository.PeopleRepository
import fr.soat.androidarchikotlin.features.base.BaseInteractor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PeopleListInteractor(peopleRepository: PeopleRepository) : BaseInteractor(peopleRepository) {
    fun getpeopleAtPage(page: Int, callback: PeopleListCallback) {
        peopleRepository.getPeopleAtPage(page, object : Callback<PeopleListResult> {
            override fun onResponse(call: Call<PeopleListResult>, response: Response<PeopleListResult>) {
                if (response?.isSuccessful) callback.onPeopleListSuccess(response.body()!!)
                else callback.onPeopleListError(response?.errorBody()?.toString())
            }

            override fun onFailure(call: Call<PeopleListResult>, t: Throwable) {
                callback.onPeopleListError(t.message)
            }
        })
    }

    interface PeopleListCallback {
        fun onPeopleListSuccess(peopleList: PeopleListResult)
        fun onPeopleListError(error: String?)
    }
}