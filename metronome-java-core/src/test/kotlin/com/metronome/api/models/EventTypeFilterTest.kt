// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventTypeFilterTest {

    @Test
    fun createEventTypeFilter() {
        val eventTypeFilter =
            EventTypeFilter.builder().addInValue("string").addNotInValue("string").build()
        assertThat(eventTypeFilter).isNotNull
        assertThat(eventTypeFilter.inValues().get()).containsExactly("string")
        assertThat(eventTypeFilter.notInValues().get()).containsExactly("string")
    }
}
