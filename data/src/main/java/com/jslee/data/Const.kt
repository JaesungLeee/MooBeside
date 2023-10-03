package com.jslee.data

/**
 * MooBeside
 * @author jaesung
 * @created 2023/08/14
 */

const val TMDB_IMAGE_PREFIX = "https://image.tmdb.org/t/p/original/"
const val PAGING_REQUEST_DATA_SIZE = 10
const val SINGLE_PAGE = 1

const val UNKNOWN_EXCEPTION = "알 수 없는 에러 발생"
const val UNKNOWN_FIELD = "확인 불가"

enum class Country(val regionCode: String, val languageCode: String) {
    KOREA("KR", "ko");
}
