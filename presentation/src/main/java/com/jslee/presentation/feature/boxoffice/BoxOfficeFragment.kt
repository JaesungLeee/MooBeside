package com.jslee.presentation.feature.boxoffice

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointBackward
import com.google.android.material.datepicker.MaterialDatePicker
import com.jslee.core.date.toDisplayedDateWithDay
import com.jslee.core.date.toDisplayedPreviousDateWithDay
import com.jslee.core.date.toMillisOfPreviousDay
import com.jslee.presentation.R
import com.jslee.presentation.common.base.BaseFragment
import com.jslee.presentation.databinding.FragmentBoxOfficeBinding
import com.jslee.presentation.feature.boxoffice.adapter.BoxOfficeAdapter
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
        BoxOfficeAdapter(onCardClick = {
            Toast.makeText(requireContext(), "CLICK", Toast.LENGTH_LONG).show()
        })
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
            .setValidator(DateValidatorPointBackward.before(System.currentTimeMillis()))
            .build()

        val datePickerBuilder = MaterialDatePicker.Builder.datePicker().apply {
            setTitleText("당일은 상영 정보가 제공되지 않습니다.")
            setCalendarConstraints(calendarConstraints)

        }.build()
        datePickerBuilder.show(childFragmentManager, DATE_PICKER_TAG)
        datePickerBuilder.addOnPositiveButtonClickListener {
            binding.tvDate.text = it.toDisplayedDateWithDay()
        }
    }

    companion object {
        private const val DATE_PICKER_TAG = "DatePicker"
    }
}
