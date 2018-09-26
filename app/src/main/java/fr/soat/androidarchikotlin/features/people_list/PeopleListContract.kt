package fr.soat.androidarchikotlin.features.people_list

import fr.soat.androidarchikotlin.data.model.SimplifiedPeople
import fr.soat.androidarchikotlin.features.base.BasePresenter
import fr.soat.androidarchikotlin.features.base.BaseView

interface PeopleListContract {

    interface View: BaseView {
        fun updatePeopleList(peopleList: List<SimplifiedPeople>)
        fun displayErrorMessage(error: String?)
    }

    interface Presenter: BasePresenter<View> {
        fun getPeopleForPage(page: Int)
    }
}