// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRetrieveRateScheduleResponseTest {

    @Test
    fun createContractRateCardRetrieveRateScheduleResponse() {
        val contractRateCardRetrieveRateScheduleResponse =
            ContractRateCardRetrieveRateScheduleResponse.builder()
                .data(
                    listOf(
                        ContractRateCardRetrieveRateScheduleResponse.Data.builder()
                            .entitled(true)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .productName("product_name")
                            .productTags(listOf("string"))
                            .rate(
                                Rate.builder()
                                    .rateType(Rate.RateType.FLAT)
                                    .creditType(
                                        CreditTypeData.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .name("name")
                                            .build()
                                    )
                                    .customRate(Rate.CustomRate.builder().build())
                                    .isProrated(true)
                                    .price(42.23)
                                    .pricingGroupValues(Rate.PricingGroupValues.builder().build())
                                    .quantity(42.23)
                                    .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                                    .useListPrices(true)
                                    .build()
                            )
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .pricingGroupValues(
                                ContractRateCardRetrieveRateScheduleResponse.Data.PricingGroupValues
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                )
                .nextPage("next_page")
                .build()
        assertThat(contractRateCardRetrieveRateScheduleResponse).isNotNull
        assertThat(contractRateCardRetrieveRateScheduleResponse.data())
            .containsExactly(
                ContractRateCardRetrieveRateScheduleResponse.Data.builder()
                    .entitled(true)
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .productName("product_name")
                    .productTags(listOf("string"))
                    .rate(
                        Rate.builder()
                            .rateType(Rate.RateType.FLAT)
                            .creditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .customRate(Rate.CustomRate.builder().build())
                            .isProrated(true)
                            .price(42.23)
                            .pricingGroupValues(Rate.PricingGroupValues.builder().build())
                            .quantity(42.23)
                            .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                            .useListPrices(true)
                            .build()
                    )
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pricingGroupValues(
                        ContractRateCardRetrieveRateScheduleResponse.Data.PricingGroupValues
                            .builder()
                            .build()
                    )
                    .build()
            )
        assertThat(contractRateCardRetrieveRateScheduleResponse.nextPage()).contains("next_page")
    }
}
