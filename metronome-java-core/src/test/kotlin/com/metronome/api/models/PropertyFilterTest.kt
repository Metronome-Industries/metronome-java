// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PropertyFilterTest {

    @Test
    fun createPropertyFilter() {
        val propertyFilter =
            PropertyFilter.builder()
                .name("name")
                .exists(true)
                .inValues(listOf("string"))
                .notInValues(listOf("string"))
                .build()
        assertThat(propertyFilter).isNotNull
        assertThat(propertyFilter.name()).isEqualTo("name")
        assertThat(propertyFilter.exists()).contains(true)
        assertThat(propertyFilter.inValues().get()).containsExactly("string")
        assertThat(propertyFilter.notInValues().get()).containsExactly("string")
    }
}
