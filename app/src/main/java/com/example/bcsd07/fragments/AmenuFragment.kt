package com.example.bcsd07.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.bcsd07.PagesAdapter
import com.example.bcsd07.R
import com.google.android.material.tabs.TabLayout


class AmenuFragment : Fragment() {
    private lateinit var mViewPagerA: ViewPager
    private lateinit var adapter: PagesAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mViewPager:ViewPager = view.findViewById(R.id.viewpager)
        val tabLayout: TabLayout = view.findViewById(R.id.tablayout)

        tabLayout.setupWithViewPager(mViewPager);
        mViewPager.adapter = PagesAdapter(childFragmentManager)

        adapter.addFrag(AmenuFragment(), "Tab1")
        adapter.addFrag(AmenuFragment(), "Tab2")
        adapter.addFrag(AmenuFragment(), "Tab3")

        mViewPagerA.setAdapter(adapter)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_amenu, container, false)
    }
//
//    companion object {
//        private val AList = arrayListOf(
//            views("red", null, null),
//            views("orange", null, null),
//            views("yellow", null, null),
//            views("green", null, null)
//        )
//    }
}
