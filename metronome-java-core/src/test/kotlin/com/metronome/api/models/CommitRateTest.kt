// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CommitRateTest {

    @Test
    fun createCommitRate() {
        val commitRate =
            CommitRate.builder()
                .rateType(CommitRate.RateType.FLAT)
                .price(0.0)
                .addTier(Tier.builder().price(0.0).size(0.0).build())
                .build()
        assertThat(commitRate).isNotNull
        assertThat(commitRate.rateType()).isEqualTo(CommitRate.RateType.FLAT)
        assertThat(commitRate.price()).contains(0.0)
        assertThat(commitRate.tiers().get())
            .containsExactly(Tier.builder().price(0.0).size(0.0).build())
    }
}
