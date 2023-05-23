package com.example.bcsd07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.bcsd07.fragments.AmenuFragment
import com.example.bcsd07.fragments.BmenuFragment
import com.example.bcsd07.fragments.CmenuFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

//private val fragmentA by lazy { AmenuFragment() }//private val fragmentOne =  AmenuFragment()
//private val fragmentB by lazy { BmenuFragment() }
//private val fragmentC by lazy { CmenuFragment() }

class MainActivity : AppCompatActivity() {
    private lateinit var mViewPager: ViewPager
    private lateinit var bnv_main: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val fragmentA=AmenuFragment()
        val fragmentB=BmenuFragment()
        val fragmentC=CmenuFragment()

        makeCurrentFragment(fragmentA)
        bnv_main=findViewById(R.id.bnv_main)
        bnv_main.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.first->makeCurrentFragment(fragmentA)
                R.id.second->makeCurrentFragment(fragmentB)
                R.id.third->makeCurrentFragment(fragmentC)
            }
            true
        }

    }

    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_container,fragment)
            commit()
        }
    }

}