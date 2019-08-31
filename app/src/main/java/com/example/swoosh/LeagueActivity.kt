package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLueague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensLeagueClicked(view: View) {
        womensLeague.isChecked = false

        CoEdLeague.isChecked = false
        selectedLueague = "Mens"
    }

    fun onWomensLeagueClicked(view: View) {
        mensLeague.isChecked = false

        CoEdLeague.isChecked = false
        selectedLueague = "Womens"


    }

    fun onCoEdLeagueClicked(view: View) {

        womensLeague.isChecked = false
        mensLeague.isChecked = false
        selectedLueague = "Co-ed"
    }


    fun leagueNextClicked(view: View) {
        if (selectedLueague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLueague)
            startActivity(skillActivity)
        } else {

            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }
    }
}
