// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitRateTest {

    @Test
    fun create() {
        val commitRate =
            CommitRate.builder()
                .rateType(CommitRate.RateType.FLAT)
                .price(0.0)
                .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                .build()

        assertThat(commitRate.rateType()).isEqualTo(CommitRate.RateType.FLAT)
        assertThat(commitRate.price()).contains(0.0)
        assertThat(commitRate.tiers().getOrNull())
            .containsExactly(CommitRate.Tier.builder().price(0.0).size(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val commitRate =
            CommitRate.builder()
                .rateType(CommitRate.RateType.FLAT)
                .price(0.0)
                .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                .build()

        val roundtrippedCommitRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(commitRate),
                jacksonTypeRef<CommitRate>(),
            )

        assertThat(roundtrippedCommitRate).isEqualTo(commitRate)
    }
}
