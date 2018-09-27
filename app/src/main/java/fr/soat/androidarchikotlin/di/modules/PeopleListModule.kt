package fr.soat.androidarchikotlin.di.modules

import dagger.Module
import dagger.Provides
import fr.soat.androidarchikotlin.data.repository.PeopleRepository
import fr.soat.androidarchikotlin.di.scopes.PeopleListScope
import fr.soat.androidarchikotlin.features.people_list.PeopleListContract
import fr.soat.androidarchikotlin.features.people_list.PeopleListInteractor
import fr.soat.androidarchikotlin.features.people_list.PeopleListPresenter

@Module
class PeopleListModule {

    @PeopleListScope
    @Provides
    fun providePeopleListInteractor(repository: PeopleRepository) : PeopleListInteractor{
        return PeopleListInteractor(repository)
    }

    @PeopleListScope
    @Provides
    fun providePeopleListPresenter(interactor: PeopleListInteractor): PeopleListContract.Presenter {
        return PeopleListPresenter(interactor)
    }
}