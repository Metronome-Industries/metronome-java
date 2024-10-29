// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TierTest {

    @Test
    fun createTier() {
        val tier = Tier.builder().price(42.23).size(42.23).build()
        assertThat(tier).isNotNull
        assertThat(tier.price()).isEqualTo(42.23)
        assertThat(tier.size()).contains(42.23)
    }
}
