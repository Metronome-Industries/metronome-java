// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuantityConversionTest {

    @Test
    fun create() {
        val quantityConversion =
            QuantityConversion.builder()
                .conversionFactor(0.0)
                .operation(QuantityConversion.Operation.MULTIPLY)
                .name("name")
                .build()

        assertThat(quantityConversion.conversionFactor()).isEqualTo(0.0)
        assertThat(quantityConversion.operation()).isEqualTo(QuantityConversion.Operation.MULTIPLY)
        assertThat(quantityConversion.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quantityConversion =
            QuantityConversion.builder()
                .conversionFactor(0.0)
                .operation(QuantityConversion.Operation.MULTIPLY)
                .name("name")
                .build()

        val roundtrippedQuantityConversion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quantityConversion),
                jacksonTypeRef<QuantityConversion>(),
            )

        assertThat(roundtrippedQuantityConversion).isEqualTo(quantityConversion)
    }
}
