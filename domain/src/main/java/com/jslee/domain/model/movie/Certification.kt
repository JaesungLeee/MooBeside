package com.jslee.domain.model.movie

import java.lang.IllegalArgumentException

/**
 * MooBeside
 * @author jaesung
 * @created 2023/10/04
 */

enum class Certification(val code: String, val meaning: String, val description: String) {
    ALL(
        code = "ALL",
        meaning = "전체",
        description = "누구나 관람할 수 있는 영화",
    ),
    R_12(
        code = "12",
        meaning = "12",
        description = "만 12세 이상인 자가 관람할 수 있는 영화",
    ),
    R_15(
        code = "15",
        meaning = "15",
        description = "만 12세 이상인 자가 관람할 수 있는 영화",
    ),
    R_18(
        code = "18",
        meaning = "청불",
        description = "청소년 보호법상 청소년은 관람할 수 없는 영화",
    ),
    RESTRICTED(
        code = "Restricted Screening",
        meaning = "제한",
        description = "폭력성·선정성·사회적 행위 등의 표현이 과도하여 인간의 보편적 존엄, 사회적 가치, 선량한 풍속 또는 국민 정서를 현저하게 해할 우려가 있어 상영 및 광고·선전에 있어 일정한 제한이 필요한 영화"
    );

    companion object {
        fun fromCode(code: String): Certification {
            return when (code) {
                ALL.code -> ALL
                R_12.code -> R_12
                R_15.code -> R_15
                R_18.code -> R_18
                RESTRICTED.code -> RESTRICTED
                else -> RESTRICTED
            }
        }

        fun getMeaning(certification: Certification?): String {
            return when (certification) {
                ALL -> ALL.meaning
                R_12 -> R_12.meaning
                R_15 -> R_15.meaning
                R_18 -> R_18.meaning
                RESTRICTED -> RESTRICTED.meaning
                else -> throw IllegalArgumentException()
            }
        }
    }
}