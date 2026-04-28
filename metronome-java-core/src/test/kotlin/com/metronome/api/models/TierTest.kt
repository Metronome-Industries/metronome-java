// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TierTest {

    @Test
    fun create() {
        val tier = Tier.builder().price(0.0).size(0.0).build()

        assertThat(tier.price()).isEqualTo(0.0)
        assertThat(tier.size()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tier = Tier.builder().price(0.0).size(0.0).build()

        val roundtrippedTier =
            jsonMapper.readValue(jsonMapper.writeValueAsString(tier), jacksonTypeRef<Tier>())

        assertThat(roundtrippedTier).isEqualTo(tier)
    }
}
