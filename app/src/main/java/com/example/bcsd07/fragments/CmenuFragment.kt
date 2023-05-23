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

class CmenuFragment : Fragment() {
    private lateinit var mViewPagerC: ViewPager
    private lateinit var adapter: PagesAdapter  //지연 초기화 변수를 선언하는 코드

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cmenu, container, false)
        mViewPagerC = view.findViewById(R.id.mViewPagerC)
        adapter = PagesAdapter(childFragmentManager)
        mViewPagerC.adapter = adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewPagerC = view.findViewById(R.id.mViewPagerC)
        mViewPagerC.adapter = adapter
    }

    companion object {
        val CList = arrayListOf(
            views(null, null, "A"),
            views(null, null, "B"),
            views(null, null, "C"),
            views(null, null, "D")
        )
    }
}