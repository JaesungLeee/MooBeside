package com.jslee.domain.model

/**
 * MooBeside
 * @author jaesung
 * @created 2024/01/16
 */
enum class BookmarkFilter(val description: String) {
    LATEST_RELEASE("최신 영화 순"),
    LATEST_BOOKMARK("최근에 담은 순"),
    SHORTEST_RUNTIME("상영 시간 짧은 순");

    companion object {
        fun getDescription(filter: BookmarkFilter): String {
            return when (filter) {
                LATEST_RELEASE -> LATEST_RELEASE.description
                LATEST_BOOKMARK -> LATEST_BOOKMARK.description
                SHORTEST_RUNTIME -> SHORTEST_RUNTIME.description
            }
        }
    }
}
