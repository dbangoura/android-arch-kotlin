package fr.soat.androidarchikotlin.features.base

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun displayErrorMessage(error: String?)
}