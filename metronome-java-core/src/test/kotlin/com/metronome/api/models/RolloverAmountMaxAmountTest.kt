// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RolloverAmountMaxAmountTest {

    @Test
    fun createRolloverAmountMaxAmount() {
        val rolloverAmountMaxAmount =
            RolloverAmountMaxAmount.builder()
                .type(RolloverAmountMaxAmount.Type.MAX_AMOUNT)
                .value(0.0)
                .build()
        assertThat(rolloverAmountMaxAmount).isNotNull
        assertThat(rolloverAmountMaxAmount.type())
            .isEqualTo(RolloverAmountMaxAmount.Type.MAX_AMOUNT)
        assertThat(rolloverAmountMaxAmount.value()).isEqualTo(0.0)
    }
}
