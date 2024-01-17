package com.jslee.presentation.feature

import android.view.View
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.jslee.core.logger.Logger
import com.jslee.core.ui.base.view.BaseActivity
import com.jslee.presentation.R
import com.jslee.presentation.databinding.ActivityMainBinding
import com.jslee.presentation.feature.detail.MovieDetailFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val navHostFragment by lazy {
        supportFragmentManager.findFragmentById(binding.fcvMain.id) as NavHostFragment
    }
    private val navController by lazy { navHostFragment.navController }
    private val viewModel: MainViewModel by viewModels()

    override fun initViews() {
        setDestinationChangeListener()
        initBottomNavigationView()
        handleDeepLinkNavigation()
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

    private fun handleDeepLinkNavigation() {
        viewModel.extractMovieIdFromDeepLink(
            intent = intent,
            onSuccess = { movieId ->
                val action = MovieDetailFragmentDirections.actionToMovieDetail(movieId.toLong())
                navController.navigate(action)
            },
            onFailure = {
                Logger.e(it)
            }
        )
    }
}
