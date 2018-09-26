package fr.soat.androidarchikotlin.features.people_list

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import fr.soat.androidarchikotlin.R
import fr.soat.androidarchikotlin.data.model.SimplifiedPeople
import fr.soat.androidarchikotlin.features.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class PeopleListActivity : BaseActivity(), PeopleListContract.View {

    val presenter: PeopleListContract.Presenter = PeopleListPresenter()
    val adapter = PeopleListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        peopleRecyclerView.layoutManager = LinearLayoutManager(this)
        peopleRecyclerView.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        presenter.onViewReady(this)
        presenter.getPeopleForPage(1)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onViewDone()
    }

    override fun updatePeopleList(peopleList: List<SimplifiedPeople>) {
        adapter.refresh(peopleList)
    }

    override fun displayErrorMessage(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }
}
