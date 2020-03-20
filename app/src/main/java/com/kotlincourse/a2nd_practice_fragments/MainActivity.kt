package com.kotlincourse.a2nd_practice_fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.kotlincourse.a2nd_practice_fragments.Adapters.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPagerMain.adapter = MainAdapter(this)

        TabLayoutMediator(tableLayoutMain, viewPagerMain, TabLayoutMediator.TabConfigurationStrategy{tab, position -> tab.text = "Step" + (position +1) }).attach()
        //TabLayoutMediator(tableLayoutMain, viewPagerMain, TabLayoutMediator.TabConfigurationStrategy{}).attach()
    }
}
