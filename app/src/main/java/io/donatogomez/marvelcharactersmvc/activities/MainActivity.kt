package io.donatogomez.marvelcharactersmvc.activities

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.donatogomez.marvelcharactersmvc.R
import io.donatogomez.marvelcharactersmvc.fragments.MainGridFragment
import io.donatogomez.marvelcharactersmvc.fragments.MainListFragment

class MainActivity : FragmentActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    /******* LifeCycle *******/
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureViews()
        configureViewListeners()
        openListFragment()
    }


    /******* Configure *******/
    private fun configureViews() {
        bottomNavigationView = findViewById(R.id.mainBottomNavigation)
    }

    private fun configureViewListeners() {
        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menugrid -> {
                    openGridFragment()
                    true
                }
                R.id.menulist -> {
                    openListFragment()
                    true
                }
                else -> false
            }
        }
    }

    private fun openListFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainListFragment.newInstance()).commit()
    }

    private fun openGridFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainGridFragment.newInstance()).commit()
    }
}