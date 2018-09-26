package fr.soat.androidarchikotlin.features.base

interface BasePresenter<V> {
    fun onViewReady(view: V)
    fun onViewDone()
}