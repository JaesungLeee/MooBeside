package com.jslee.presentation.feature.castdetail.model

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/11
 */
enum class ParticipationTab(val role: String) {
    CAST("참여작"),
    CREW("제작");

    companion object {
        fun getRole(participation: ParticipationTab): String {
            return when (participation) {
                CAST -> CAST.role
                CREW -> CREW.role
            }
        }
    }
}