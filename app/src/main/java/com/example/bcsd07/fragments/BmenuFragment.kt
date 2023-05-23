package com.example.bcsd07.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.bcsd07.PagesAdapter
import com.example.bcsd07.R
import com.example.bcsd07.views

class BmenuFragment : Fragment() {
    private lateinit var mViewPagerB: ViewPager
    private lateinit var adapter: PagesAdapter  //지연 초기화 변수를 선언하는 코드

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_bmenu, container, false)
        val mViewPager = view.findViewById(R.id.mViewPagerB) as ViewPager
        mViewPager.adapter = PagesAdapter(childFragmentManager)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewPagerB = view.findViewById(R.id.mViewPagerB)
        mViewPagerB.adapter = adapter
    }

    companion object {

        val BList = arrayListOf(
            views(null, 0, null),
            views(null, 1, null),
            views(null, 2, null),
            views(null, 3, null)
        )
    }

}