package com.jslee.presentation.feature.boxoffice

import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointBackward
import com.google.android.material.datepicker.MaterialDatePicker
import com.jslee.core.ui.base.view.BaseFragment
import com.jslee.core.ui.extension.toDisplayedDateWithDay
import com.jslee.core.ui.extension.toDisplayedPreviousDateWithDay
import com.jslee.core.ui.extension.toMillisOfPreviousDay
import com.jslee.core.ui.extension.toShortenDate
import com.jslee.presentation.R
import com.jslee.presentation.databinding.FragmentBoxOfficeBinding
import com.jslee.presentation.feature.boxoffice.adapter.BoxOfficeAdapter
import com.jslee.presentation.feature.detail.MovieDetailFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/08
 */
@AndroidEntryPoint
class BoxOfficeFragment : BaseFragment<FragmentBoxOfficeBinding>(R.layout.fragment_box_office) {

    @Inject
    lateinit var fakeBoxOfficeData: FakeBoxOfficeData

    private val viewModel: BoxOfficeViewModel by viewModels()

    private val boxOfficeAdapter by lazy {
        BoxOfficeAdapter(onCardClick = { movieId ->
            navigateToMovieDetail(movieId)
        })
    }

    private fun navigateToMovieDetail(movieId: Long) {
        val action = MovieDetailFragmentDirections.actionToMovieDetail(movieId)
        findNavController().navigate(action)
    }

    override fun initViews() {
        with(binding) {
            tvDate.text =
                System.currentTimeMillis().toDisplayedPreviousDateWithDay()
            ivCalendar.setOnClickListener {
                showDatePickerDialog()
            }
            rvBoxOffice.apply {
                adapter = boxOfficeAdapter
                setHasFixedSize(true)
            }
        }
    }

    override fun observeStates() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.boxOfficeUiState.collectLatest { state ->
                    when (state) {
                        Loading -> {
                            Timber.e("Loading")
                        }

                        is Success -> {
                            boxOfficeAdapter.submitList(state.data)
                        }

                        Failure -> {
                            Timber.e("Error")
                        }
                    }
                }
            }
        }
    }

    private fun showDatePickerDialog() {
        val calendarConstraints = CalendarConstraints.Builder()
            .setValidator(
                DateValidatorPointBackward.before(
                    System.currentTimeMillis().toMillisOfPreviousDay()
                )
            )
            .build()

        val datePickerBuilder = MaterialDatePicker.Builder.datePicker().apply {
            setTitleText("당일은 상영 정보가 제공되지 않습니다.")
            setCalendarConstraints(calendarConstraints)

        }.build()
        datePickerBuilder.show(childFragmentManager, DATE_PICKER_TAG)
        datePickerBuilder.addOnPositiveButtonClickListener {
            binding.tvDate.text = it.toDisplayedDateWithDay()
            viewModel.updateBoxOfficeByTargetDate(it.toShortenDate())
        }
    }

    companion object {
        private const val DATE_PICKER_TAG = "DatePicker"
    }
}
