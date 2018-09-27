package fr.soat.androidarchikotlin.features.people_detail

import fr.soat.androidarchikotlin.data.model.People
import fr.soat.androidarchikotlin.features.base.BasePresenterImpl

class PeopleDetailPresenter(val interactor: PeopleDetailInteractor) : BasePresenterImpl<PeopleDetailContract.View>(), PeopleDetailContract.Presenter, PeopleDetailInteractor.PeopleDetailCallback {

    override fun getPeopleDetail(peopleId: Int) {
        view?.showLoading()
        interactor.getPeopleDetail(peopleId, this)
    }

    override fun onPeopleDetailSuccess(people: People) {
        view?.displayPeopleDetails(people)
        view?.hideLoading()
    }

    override fun onPeopleDetailError(error: String?) {
        view?.displayErrorMessage(error)
        view?.hideLoading()
    }

}