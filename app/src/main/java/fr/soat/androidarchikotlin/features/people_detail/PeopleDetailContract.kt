package fr.soat.androidarchikotlin.features.people_detail

import fr.soat.androidarchikotlin.data.model.People
import fr.soat.androidarchikotlin.features.base.BasePresenter
import fr.soat.androidarchikotlin.features.base.BaseView

interface PeopleDetailContract {

    interface View : BaseView {
        fun displayPeopleDetails(people: People)
    }

    interface Presenter : BasePresenter<View> {
        fun getPeopleDetail(peopleId: Int)
    }
}