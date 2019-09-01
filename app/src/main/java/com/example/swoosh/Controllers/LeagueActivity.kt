package com.example.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onMensLeagueClicked(view: View) {
        womensLeague.isChecked = false

        CoEdLeague.isChecked = false
        player.league = "mens"
    }

    fun onWomensLeagueClicked(view: View) {
        mensLeague.isChecked = false

        CoEdLeague.isChecked = false
        player.league = "womens"


    }

    fun onCoEdLeagueClicked(view: View) {

        womensLeague.isChecked = false
        mensLeague.isChecked = false
        player.league = "co-ed"
    }


    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {

            Toast.makeText(this, "Please select a League", Toast.LENGTH_SHORT).show()
        }
    }
}
