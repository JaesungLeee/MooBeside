package com.jslee.presentation.feature

import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.jslee.core.ui.base.view.BaseActivity
import com.jslee.presentation.R
import com.jslee.presentation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val navHostFragment by lazy {
        supportFragmentManager.findFragmentById(binding.fcvMain.id) as NavHostFragment
    }

    private val navController by lazy { navHostFragment.navController }

    override fun initViews() {
        setDestinationChangeListener()
        initBottomNavigationView()
    }

    private fun setDestinationChangeListener() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            binding.bnvMain.visibility = when (destination.id) {
                R.id.homeFragment, R.id.boxOfficeFragment, R.id.bookmarkFragment -> View.VISIBLE
                else -> View.GONE
            }
        }
    }

    private fun initBottomNavigationView() {
        binding.bnvMain.setupWithNavController(navController)
    }
}