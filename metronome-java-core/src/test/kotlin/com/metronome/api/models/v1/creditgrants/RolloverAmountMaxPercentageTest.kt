// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RolloverAmountMaxPercentageTest {

    @Test
    fun create() {
        val rolloverAmountMaxPercentage =
            RolloverAmountMaxPercentage.builder()
                .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                .value(0.0)
                .build()

        assertThat(rolloverAmountMaxPercentage.type())
            .isEqualTo(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
        assertThat(rolloverAmountMaxPercentage.value()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rolloverAmountMaxPercentage =
            RolloverAmountMaxPercentage.builder()
                .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                .value(0.0)
                .build()

        val roundtrippedRolloverAmountMaxPercentage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rolloverAmountMaxPercentage),
                jacksonTypeRef<RolloverAmountMaxPercentage>(),
            )

        assertThat(roundtrippedRolloverAmountMaxPercentage).isEqualTo(rolloverAmountMaxPercentage)
    }
}
