package fr.soat.androidarchikotlin.features.people_detail

import android.os.Bundle
import fr.soat.androidarchikotlin.R
import fr.soat.androidarchikotlin.data.model.People
import fr.soat.androidarchikotlin.features.base.BaseActivity
import fr.soat.androidarchikotlin.utils.*
import kotlinx.android.synthetic.main.activity_people_detail.*

class PeopleDetailActivity : BaseActivity(), PeopleDetailContract.View {

    val presenter: PeopleDetailContract.Presenter = PeopleDetailPresenter()

    var mPeopleId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_people_detail)

        peopleName.text = intent?.getStringExtra(PEOPLE_NAME)
        mPeopleId = intent?.getIntExtra(PEOPLE_ID, 0) ?: 0
    }

    override fun onStart() {
        super.onStart()
        presenter.onViewReady(this)
        presenter.getPeopleDetail(mPeopleId)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onViewDone()
    }

    override fun displayPeopleDetails(people: People) {
        peopleName.text = people.name
        peopleHeight.text = people.height
        peopleMass.text = people.mass
        peopleHairColor.text = people.hairColor
        peopleSkinColor.text = people.skinColor
        peopleEyesColor.text = people.eyeColor
        peopleGender.text = people.gender

    }
}