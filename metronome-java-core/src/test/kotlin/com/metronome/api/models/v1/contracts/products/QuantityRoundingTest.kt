// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuantityRoundingTest {

    @Test
    fun create() {
        val quantityRounding =
            QuantityRounding.builder()
                .decimalPlaces(0.0)
                .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                .build()

        assertThat(quantityRounding.decimalPlaces()).isEqualTo(0.0)
        assertThat(quantityRounding.roundingMethod())
            .isEqualTo(QuantityRounding.RoundingMethod.ROUND_UP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quantityRounding =
            QuantityRounding.builder()
                .decimalPlaces(0.0)
                .roundingMethod(QuantityRounding.RoundingMethod.ROUND_UP)
                .build()

        val roundtrippedQuantityRounding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quantityRounding),
                jacksonTypeRef<QuantityRounding>(),
            )

        assertThat(roundtrippedQuantityRounding).isEqualTo(quantityRounding)
    }
}
