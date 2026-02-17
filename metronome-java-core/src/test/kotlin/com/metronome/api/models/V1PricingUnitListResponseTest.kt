// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1PricingUnitListResponseTest {

    @Test
    fun createV1PricingUnitListResponse() {
        val v1PricingUnitListResponse =
            V1PricingUnitListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isCurrency(true)
                .name("name")
                .build()
        assertThat(v1PricingUnitListResponse).isNotNull
        assertThat(v1PricingUnitListResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1PricingUnitListResponse.isCurrency()).contains(true)
        assertThat(v1PricingUnitListResponse.name()).contains("name")
    }
}
