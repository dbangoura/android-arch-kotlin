package fr.soat.androidarchikotlin.di.components

import dagger.Component
import fr.soat.androidarchikotlin.di.modules.PeopleListModule
import fr.soat.androidarchikotlin.di.scopes.PeopleListScope
import fr.soat.androidarchikotlin.features.people_list.PeopleListActivity

@PeopleListScope
@Component(modules = [PeopleListModule::class], dependencies = [AppComponent::class])
interface PeopleListComponent {
    fun inject(peopleListActivity: PeopleListActivity)
}