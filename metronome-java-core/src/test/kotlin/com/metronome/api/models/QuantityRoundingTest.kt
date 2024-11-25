// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QuantityRoundingTest {

    @Test
    fun createQuantityRounding() {
        val quantityRounding =
            QuantityRounding.builder()
                .decimalPlaces(0.0)
                .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                .build()
        assertThat(quantityRounding).isNotNull
        assertThat(quantityRounding.decimalPlaces()).isEqualTo(0.0)
        assertThat(quantityRounding.roundingMethod())
            .isEqualTo(QuantityRounding.RoundingMethod.ROUND_UP)
    }
}
