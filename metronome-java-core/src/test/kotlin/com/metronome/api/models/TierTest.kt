// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TierTest {

    @Test
    fun createTier() {
        val tier = Tier.builder().price(0.0).size(0.0).build()
        assertThat(tier).isNotNull
        assertThat(tier.price()).isEqualTo(0.0)
        assertThat(tier.size()).contains(0.0)
    }
}
