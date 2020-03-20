package com.kotlincourse.a2nd_practice_fragments.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kotlincourse.a2nd_practice_fragments.Fragments.BlankFragment

class MainAdapter (fragmentActivity : FragmentActivity ) : FragmentStateAdapter(fragmentActivity) {

    private val fragmentSize = 3

    override fun getItemCount(): Int {
        return fragmentSize
    }

    override fun createFragment(position: Int): Fragment {
        return  BlankFragment.newInstance(position)
    }
}