// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyFilterTest {

    @Test
    fun create() {
        val propertyFilter =
            PropertyFilter.builder()
                .name("name")
                .exists(true)
                .addInValue("string")
                .addNotInValue("string")
                .build()

        assertThat(propertyFilter.name()).isEqualTo("name")
        assertThat(propertyFilter.exists()).contains(true)
        assertThat(propertyFilter.inValues().getOrNull()).containsExactly("string")
        assertThat(propertyFilter.notInValues().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyFilter =
            PropertyFilter.builder()
                .name("name")
                .exists(true)
                .addInValue("string")
                .addNotInValue("string")
                .build()

        val roundtrippedPropertyFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyFilter),
                jacksonTypeRef<PropertyFilter>(),
            )

        assertThat(roundtrippedPropertyFilter).isEqualTo(propertyFilter)
    }
}
