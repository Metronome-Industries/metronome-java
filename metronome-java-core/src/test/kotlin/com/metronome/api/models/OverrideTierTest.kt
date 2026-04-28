// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OverrideTierTest {

    @Test
    fun create() {
        val overrideTier = OverrideTier.builder().multiplier(0.0).size(0.0).build()

        assertThat(overrideTier.multiplier()).isEqualTo(0.0)
        assertThat(overrideTier.size()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val overrideTier = OverrideTier.builder().multiplier(0.0).size(0.0).build()

        val roundtrippedOverrideTier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(overrideTier),
                jacksonTypeRef<OverrideTier>(),
            )

        assertThat(roundtrippedOverrideTier).isEqualTo(overrideTier)
    }
}
