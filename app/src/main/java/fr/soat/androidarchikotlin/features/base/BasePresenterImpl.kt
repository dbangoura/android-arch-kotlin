package fr.soat.androidarchikotlin.features.base

open class BasePresenterImpl<V: BaseView?> : BasePresenter<V> {

    var view : V? = null

    override fun onViewReady(view: V) {
       this.view = view
    }

    override fun onViewDone() {
        this.view = null
    }
}