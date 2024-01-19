package com.jslee.presentation.feature.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.app.ShareCompat
import androidx.fragment.app.viewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.jslee.core.ui.extension.showToast
import com.jslee.presentation.R
import com.jslee.presentation.databinding.DialogShareBottomSheetBinding
import dagger.hilt.android.AndroidEntryPoint
import com.jslee.core.designsystem.R as DR

/**
 * MooBeside
 * @author jaesung
 * @created 2023/12/23
 */
@AndroidEntryPoint
class ShareBottomSheetFragment : BottomSheetDialogFragment() {

    private var _binding: DialogShareBottomSheetBinding? = null
    val binding: DialogShareBottomSheetBinding get() = requireNotNull(_binding)

    private val viewModel: MovieDetailViewModel by viewModels(ownerProducer = { requireParentFragment() })

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = DialogShareBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setBackgroundDimWindow()

        binding.tvShareTitle.text =
            requireContext().getString(R.string.text_share_title, viewModel.movieName.value)

        binding.clShareKakao.setOnClickListener {
            viewModel.shareKakaoLink(
                context = requireActivity(),
                movieId = viewModel.movieId.value,
                onSuccess = { intent ->
                    requireActivity().startActivity(intent)
                },
                onFailure = {
                    if (it.isNullOrBlank()) {
                        requireActivity().showToast(getString(R.string.action_kakao_share_not_install))
                    } else {
                        requireActivity().showToast(getString(R.string.action_kakao_share_common_error))
                    }
                }
            )
        }

        binding.clShareOther.setOnClickListener {
            viewModel.createDynamicLink(viewModel.movieId.value) { uri ->
                ShareCompat.IntentBuilder(requireContext())
                    .setType("text/plain")
                    .setChooserTitle(
                        requireContext().getString(
                            R.string.action_share_chooser_title,
                            viewModel.movieName.value
                        )
                    )
                    .setText(
                        requireContext().getString(
                            R.string.action_movie_detail_deep_link,
                            uri
                        )
                    )
                    .startChooser()
            }
        }
    }

    private fun setBackgroundDimWindow() {
        dialog?.window?.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
        dialog?.window?.setDimAmount(0.6f)
    }

    override fun getTheme(): Int {
        return DR.style.MooBeside_BottomSheet
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    companion object {
        const val SHARE_BOTTOM_SHEET_TAG = "ShareBottomSheet"
    }
}