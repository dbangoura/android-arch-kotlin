package fr.soat.androidarchikotlin.di.modules

import dagger.Module
import dagger.Provides
import fr.soat.androidarchikotlin.data.repository.PeopleRepository
import fr.soat.androidarchikotlin.data.repository.PeopleRepositoryImpl
import fr.soat.androidarchikotlin.di.scopes.AppScope

@Module
class AppModule {

    @AppScope
    @Provides
    fun providePeopleRepository(): PeopleRepository {
        return PeopleRepositoryImpl()
    }
}