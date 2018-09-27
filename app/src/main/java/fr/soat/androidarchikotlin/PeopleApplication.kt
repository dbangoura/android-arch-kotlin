package fr.soat.androidarchikotlin

import android.app.Application
import fr.soat.androidarchikotlin.di.components.AppComponent
import fr.soat.androidarchikotlin.di.components.DaggerAppComponent
import fr.soat.androidarchikotlin.di.modules.AppModule

class PeopleApplication: Application() {



    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule())
                .build()

        appComponent.inject(this)
    }

    companion object {
        lateinit var appComponent: AppComponent
    }
}