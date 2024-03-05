package com.jslee.presentation.feature

import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.jslee.core.logger.Logger
import com.jslee.core.ui.base.view.BaseActivity
import com.jslee.presentation.R
import com.jslee.presentation.databinding.ActivityMainBinding
import com.jslee.presentation.feature.detail.MovieDetailFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

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
        observeStates()
    }

    private fun setDestinationChangeListener() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            viewModel.setCurrentDestination("${destination.label}")
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

    private fun observeStates() {
        lifecycleScope.launch {
            lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.navBarVisibility.collectLatest { isVisible ->
                    binding.bnvMain.isVisible = isVisible
                }
            }
        }
    }
}
