// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventTypeFilterTest {

    @Test
    fun create() {
        val eventTypeFilter =
            EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()

        assertThat(eventTypeFilter.inValues().getOrNull()).containsExactly("string")
        assertThat(eventTypeFilter.notInValues().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventTypeFilter =
            EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()

        val roundtrippedEventTypeFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventTypeFilter),
                jacksonTypeRef<EventTypeFilter>(),
            )

        assertThat(roundtrippedEventTypeFilter).isEqualTo(eventTypeFilter)
    }
}
