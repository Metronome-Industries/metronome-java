// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BaseUsageFilterTest {

    @Test
    fun createBaseUsageFilter() {
        val baseUsageFilter =
            BaseUsageFilter.builder()
                .groupKey("group_key")
                .addGroupValue("string")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(baseUsageFilter).isNotNull
        assertThat(baseUsageFilter.groupKey()).isEqualTo("group_key")
        assertThat(baseUsageFilter.groupValues()).containsExactly("string")
        assertThat(baseUsageFilter.startingAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
