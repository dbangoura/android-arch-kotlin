package fr.soat.androidarchikotlin.di.modules

import dagger.Module
import dagger.Provides
import fr.soat.androidarchikotlin.data.repository.PeopleRepository
import fr.soat.androidarchikotlin.di.scopes.PeopleDetailScope
import fr.soat.androidarchikotlin.features.people_detail.PeopleDetailContract
import fr.soat.androidarchikotlin.features.people_detail.PeopleDetailInteractor
import fr.soat.androidarchikotlin.features.people_detail.PeopleDetailPresenter

@Module
class PeopleDetailModule {

    @PeopleDetailScope
    @Provides
    fun providePeopleDetailInteractor(repository: PeopleRepository) : PeopleDetailInteractor {
        return PeopleDetailInteractor(repository)
    }

    @PeopleDetailScope
    @Provides
    fun providePeopleDetailPresenter(interactor: PeopleDetailInteractor) : PeopleDetailContract.Presenter {
        return PeopleDetailPresenter(interactor)
    }
}