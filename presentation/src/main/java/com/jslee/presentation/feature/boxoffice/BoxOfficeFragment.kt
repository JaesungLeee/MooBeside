package com.jslee.presentation.feature.boxoffice

import android.widget.Toast
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointBackward
import com.google.android.material.datepicker.MaterialDatePicker
import com.jslee.core.date.getDisplayedDate
import com.jslee.core.date.getDisplayedDateWithDay
import com.jslee.core.date.getMillisOfPreviousDay
import com.jslee.presentation.R
import com.jslee.presentation.common.base.BaseFragment
import com.jslee.presentation.databinding.FragmentBoxOfficeBinding
import com.jslee.presentation.feature.boxoffice.adapter.BoxOfficeAdapter
import dagger.hilt.android.AndroidEntryPoint
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

    private val boxOfficeAdapter by lazy {
        BoxOfficeAdapter(onCardClick = {
            Toast.makeText(requireContext(), "CLICK", Toast.LENGTH_LONG).show()
        })
    }

    override fun initViews() {
        initDatePicker()
        initRecyclerView()
    }

    private fun initDatePicker() {
        with(binding) {
            tvDate.text =
                System.currentTimeMillis().getMillisOfPreviousDay().getDisplayedDateWithDay()
            ivCalendar.setOnClickListener {
                showDatePickerDialog()
            }
        }
    }

    private fun initRecyclerView() {
        with(binding.rvBoxOffice) {
            adapter = boxOfficeAdapter.also {
                it.submitList(fakeBoxOfficeData.provideData())
            }
            setHasFixedSize(true)
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
            binding.tvDate.text = it.getDisplayedDateWithDay()
        }
    }

    companion object {
        private const val DATE_PICKER_TAG = "DatePicker"
    }
}
