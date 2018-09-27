package fr.soat.androidarchikotlin.di.components

import dagger.Component
import fr.soat.androidarchikotlin.PeopleApplication
import fr.soat.androidarchikotlin.data.repository.PeopleRepository
import fr.soat.androidarchikotlin.di.modules.AppModule
import fr.soat.androidarchikotlin.di.scopes.AppScope

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(peopleApplication: PeopleApplication)
    fun getRepository(): PeopleRepository
}