package fr.soat.androidarchikotlin.features.people_list


import fr.soat.androidarchikotlin.data.model.PeopleListResult
import fr.soat.androidarchikotlin.data.repository.PeopleRepository
import fr.soat.androidarchikotlin.features.base.BaseInteractor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PeopleListInteractorTest(peopleRepository: PeopleRepository) : BaseInteractor(peopleRepository) {

    fun getPeopleAtPage(page: Int) {
        peopleRepository.getPeopleAtPage(page, object : Callback<PeopleListResult> {
            override fun onResponse(call: Call<PeopleListResult>, response: Response<PeopleListResult>) {
                if (response == null || !response.isSuccessful && response.errorBody() != null) {
                    //callback.onError();
                } else {
                    //callback.onPeopleListSuccess(response.body());
                }
            }

            override fun onFailure(call: Call<PeopleListResult>, t: Throwable) {
                //callback.onError();
            }
        })
    }
}