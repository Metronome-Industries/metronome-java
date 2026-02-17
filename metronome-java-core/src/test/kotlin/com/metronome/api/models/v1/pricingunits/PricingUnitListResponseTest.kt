// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.pricingunits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingUnitListResponseTest {

    @Test
    fun create() {
        val pricingUnitListResponse =
            PricingUnitListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isCurrency(true)
                .name("name")
                .build()

        assertThat(pricingUnitListResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pricingUnitListResponse.isCurrency()).contains(true)
        assertThat(pricingUnitListResponse.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pricingUnitListResponse =
            PricingUnitListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isCurrency(true)
                .name("name")
                .build()

        val roundtrippedPricingUnitListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pricingUnitListResponse),
                jacksonTypeRef<PricingUnitListResponse>(),
            )

        assertThat(roundtrippedPricingUnitListResponse).isEqualTo(pricingUnitListResponse)
    }
}
