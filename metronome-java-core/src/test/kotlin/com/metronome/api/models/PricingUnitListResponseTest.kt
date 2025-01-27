// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PricingUnitListResponseTest {

    @Test
    fun createPricingUnitListResponse() {
        val pricingUnitListResponse =
            PricingUnitListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isCurrency(true)
                .name("name")
                .build()
        assertThat(pricingUnitListResponse).isNotNull
        assertThat(pricingUnitListResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pricingUnitListResponse.isCurrency()).contains(true)
        assertThat(pricingUnitListResponse.name()).contains("name")
    }
}
