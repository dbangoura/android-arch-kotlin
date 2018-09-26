package fr.soat.androidarchikotlin.features.base

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

open class BaseActivity : AppCompatActivity(), BaseView {

    lateinit var mHandler : Handler
    lateinit var mProgressDialogFragment : ProgressDialogFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mHandler = Handler()
    }

    override fun showLoading() {
        mHandler.post {
            mProgressDialogFragment = ProgressDialogFragment.newInstance()
            mProgressDialogFragment.show(supportFragmentManager, ProgressDialogFragment.TAG)
        }
    }

    override fun hideLoading() {
        mProgressDialogFragment?.dismiss()
    }
}