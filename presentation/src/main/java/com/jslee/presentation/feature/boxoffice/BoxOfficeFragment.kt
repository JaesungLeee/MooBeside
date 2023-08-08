package com.jslee.presentation.feature.boxoffice

import android.widget.Toast
import com.jslee.presentation.R
import com.jslee.presentation.common.base.BaseFragment
import com.jslee.presentation.databinding.FragmentBoxOfficeBinding
import com.jslee.presentation.feature.boxoffice.adapter.BoxOfficeAdapter
import dagger.hilt.android.AndroidEntryPoint
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
        initRecyclerView()
    }

    private fun initRecyclerView() {
        with(binding.rvBoxOffice) {
            adapter = boxOfficeAdapter.also {
                it.submitList(fakeBoxOfficeData.provideData())
            }
            setHasFixedSize(true)
        }
    }
}