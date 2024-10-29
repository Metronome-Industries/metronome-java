// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class QuantityConversionTest {

    @Test
    fun createQuantityConversion() {
        val quantityConversion =
            QuantityConversion.builder()
                .conversionFactor(42.23)
                .operation(QuantityConversion.Operation.MULTIPLY)
                .name("name")
                .build()
        assertThat(quantityConversion).isNotNull
        assertThat(quantityConversion.conversionFactor()).isEqualTo(42.23)
        assertThat(quantityConversion.operation()).isEqualTo(QuantityConversion.Operation.MULTIPLY)
        assertThat(quantityConversion.name()).contains("name")
    }
}
