package fr.soat.androidarchikotlin.di.components

import dagger.Component
import fr.soat.androidarchikotlin.di.modules.PeopleDetailModule
import fr.soat.androidarchikotlin.di.scopes.PeopleDetailScope
import fr.soat.androidarchikotlin.features.people_detail.PeopleDetailActivity

@PeopleDetailScope
@Component(modules = [PeopleDetailModule::class], dependencies = [AppComponent::class])
interface PeopleDetailComponent {
    fun inject(peopleDetailActivity: PeopleDetailActivity)
}