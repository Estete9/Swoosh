package com.example.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensLeagueClicked(view: View) {
        womensLeague.isChecked = false

        CoEdLeague.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensLeagueClicked(view: View) {
        mensLeague.isChecked = false

        CoEdLeague.isChecked = false
        selectedLeague = "womens"


    }

    fun onCoEdLeagueClicked(view: View) {

        womensLeague.isChecked = false
        mensLeague.isChecked = false
        selectedLeague = "co-ed"
    }


    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {

            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }
    }
}
