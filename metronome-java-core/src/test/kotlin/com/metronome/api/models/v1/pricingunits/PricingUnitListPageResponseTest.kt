// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.pricingunits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingUnitListPageResponseTest {

    @Test
    fun create() {
        val pricingUnitListPageResponse =
            PricingUnitListPageResponse.builder()
                .addData(
                    PricingUnitListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .isCurrency(true)
                        .name("name")
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(pricingUnitListPageResponse.data())
            .containsExactly(
                PricingUnitListResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .isCurrency(true)
                    .name("name")
                    .build()
            )
        assertThat(pricingUnitListPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pricingUnitListPageResponse =
            PricingUnitListPageResponse.builder()
                .addData(
                    PricingUnitListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .isCurrency(true)
                        .name("name")
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedPricingUnitListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pricingUnitListPageResponse),
                jacksonTypeRef<PricingUnitListPageResponse>(),
            )

        assertThat(roundtrippedPricingUnitListPageResponse).isEqualTo(pricingUnitListPageResponse)
    }
}
