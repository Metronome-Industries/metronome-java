// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.creditgrants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RolloverAmountMaxAmountTest {

    @Test
    fun create() {
        val rolloverAmountMaxAmount =
            RolloverAmountMaxAmount.builder()
                .type(RolloverAmountMaxAmount.Type.MAX_AMOUNT)
                .value(0.0)
                .build()

        assertThat(rolloverAmountMaxAmount.type())
            .isEqualTo(RolloverAmountMaxAmount.Type.MAX_AMOUNT)
        assertThat(rolloverAmountMaxAmount.value()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rolloverAmountMaxAmount =
            RolloverAmountMaxAmount.builder()
                .type(RolloverAmountMaxAmount.Type.MAX_AMOUNT)
                .value(0.0)
                .build()

        val roundtrippedRolloverAmountMaxAmount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rolloverAmountMaxAmount),
                jacksonTypeRef<RolloverAmountMaxAmount>(),
            )

        assertThat(roundtrippedRolloverAmountMaxAmount).isEqualTo(rolloverAmountMaxAmount)
    }
}
