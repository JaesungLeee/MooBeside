package com.jslee.presentation.feature.castdetail

import com.jslee.presentation.feature.castdetail.model.CastDetailUiModel

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/12
 */
sealed class CastDetailUiState {
    object Loading : CastDetailUiState()
    data class Success(
        val uiModel: CastDetailUiModel,
    ) : CastDetailUiState()
}
