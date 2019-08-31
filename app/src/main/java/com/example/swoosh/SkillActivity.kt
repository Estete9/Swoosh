package com.example.swoosh

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league =""

    var skillSelection = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
    fun ballerSkillSelected (view:View){
        beginnerSkill.isChecked = false
        skillSelection="Baller"
    }

    fun beginnerSkillSelected (view:View) {
        ballerSkill.isChecked = false
        skillSelection = "Beginner"
    }
    }
