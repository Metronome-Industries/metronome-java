// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RolloverAmountMaxPercentageTest {

    @Test
    fun createRolloverAmountMaxPercentage() {
        val rolloverAmountMaxPercentage =
            RolloverAmountMaxPercentage.builder()
                .type(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
                .value(0.0)
                .build()
        assertThat(rolloverAmountMaxPercentage).isNotNull
        assertThat(rolloverAmountMaxPercentage.type())
            .isEqualTo(RolloverAmountMaxPercentage.Type.MAX_PERCENTAGE)
        assertThat(rolloverAmountMaxPercentage.value()).isEqualTo(0.0)
    }
}
