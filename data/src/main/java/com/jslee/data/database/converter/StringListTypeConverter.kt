package com.jslee.data.database.converter

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * MooBeside
 * @author jaesung
 * @created 2023/11/14
 */

@ProvidedTypeConverter
class StringListTypeConverter {

    private val json = Json { ignoreUnknownKeys = true }

    @TypeConverter
    fun fromString(value: String): List<String> {
        return json.decodeFromString(value)
    }

    @TypeConverter
    fun fromList(value: List<String>): String {
        return json.encodeToString(value)
    }
}