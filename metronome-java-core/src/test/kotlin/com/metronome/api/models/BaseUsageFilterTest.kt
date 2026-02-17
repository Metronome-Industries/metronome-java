// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseUsageFilterTest {

    @Test
    fun create() {
        val baseUsageFilter =
            BaseUsageFilter.builder()
                .groupKey("group_key")
                .addGroupValue("string")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(baseUsageFilter.groupKey()).isEqualTo("group_key")
        assertThat(baseUsageFilter.groupValues()).containsExactly("string")
        assertThat(baseUsageFilter.startingAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseUsageFilter =
            BaseUsageFilter.builder()
                .groupKey("group_key")
                .addGroupValue("string")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBaseUsageFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseUsageFilter),
                jacksonTypeRef<BaseUsageFilter>(),
            )

        assertThat(roundtrippedBaseUsageFilter).isEqualTo(baseUsageFilter)
    }
}
