package com.example.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""

    var skillSelection = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun ballerSkillSelected(view: View) {
        beginnerSkillBtn.isChecked = false
        skillSelection = "baller"
    }

    fun beginnerSkillSelected(view: View) {
        ballerSkillBtn.isChecked = false
        skillSelection = "beginner"
    }

    fun onSkillFinishClicked(view: View) {
        if (skillSelection != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_SKILL, skillSelection)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            startActivity(finishActivity)
        } else {

            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }

}
