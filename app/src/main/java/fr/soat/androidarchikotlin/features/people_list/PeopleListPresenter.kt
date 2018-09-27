package fr.soat.androidarchikotlin.features.people_list

import fr.soat.androidarchikotlin.data.model.PeopleListResult
import fr.soat.androidarchikotlin.data.model.SimplifiedPeople
import fr.soat.androidarchikotlin.data.repository.PeopleRepositoryImpl
import fr.soat.androidarchikotlin.features.base.BasePresenterImpl

class PeopleListPresenter: BasePresenterImpl<PeopleListContract.View>(), PeopleListContract.Presenter, PeopleListInteractor.PeopleListCallback {

    val interactor = PeopleListInteractor(PeopleRepositoryImpl())

    override fun getPeopleForPage(page: Int) {
        view?.showLoading()
        interactor.getPeopleAtPage(page, this)
    }

    override fun onPeopleListSuccess(peopleList: PeopleListResult) {
        view?.updatePeopleList(peopleList.results)
        view?.hideLoading()
    }

    override fun onPeopleListError(error: String?) {
        view?.displayErrorMessage(error)
        view?.hideLoading()
    }

    override fun onPeopleSelected(people: SimplifiedPeople) {
        view?.displayPeopleDetailFor(people)
    }

}