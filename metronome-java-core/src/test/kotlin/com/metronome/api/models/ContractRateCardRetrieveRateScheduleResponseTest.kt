// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRetrieveRateScheduleResponseTest {

    @Test
    fun createContractRateCardRetrieveRateScheduleResponse() {
        val contractRateCardRetrieveRateScheduleResponse =
            ContractRateCardRetrieveRateScheduleResponse.builder()
                .addData(
                    ContractRateCardRetrieveRateScheduleResponse.Data.builder()
                        .entitled(true)
                        .productCustomFields(
                            ContractRateCardRetrieveRateScheduleResponse.Data.ProductCustomFields
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .productName("product_name")
                        .addProductTag("string")
                        .rate(
                            Rate.builder()
                                .rateType(Rate.RateType.FLAT)
                                .creditType(
                                    CreditTypeData.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .build()
                                )
                                .customRate(
                                    Rate.CustomRate.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .isProrated(true)
                                .price(0.0)
                                .pricingGroupValues(
                                    Rate.PricingGroupValues.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .quantity(0.0)
                                .addTier(Tier.builder().price(0.0).size(0.0).build())
                                .useListPrices(true)
                                .build()
                        )
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .commitRate(
                            ContractRateCardRetrieveRateScheduleResponse.Data.CommitRate.builder()
                                .rateType(
                                    ContractRateCardRetrieveRateScheduleResponse.Data.CommitRate
                                        .RateType
                                        .FLAT
                                )
                                .price(0.0)
                                .addTier(Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pricingGroupValues(
                            ContractRateCardRetrieveRateScheduleResponse.Data.PricingGroupValues
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()
        assertThat(contractRateCardRetrieveRateScheduleResponse).isNotNull
        assertThat(contractRateCardRetrieveRateScheduleResponse.data())
            .containsExactly(
                ContractRateCardRetrieveRateScheduleResponse.Data.builder()
                    .entitled(true)
                    .productCustomFields(
                        ContractRateCardRetrieveRateScheduleResponse.Data.ProductCustomFields
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .productName("product_name")
                    .addProductTag("string")
                    .rate(
                        Rate.builder()
                            .rateType(Rate.RateType.FLAT)
                            .creditType(
                                CreditTypeData.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .build()
                            )
                            .customRate(
                                Rate.CustomRate.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .isProrated(true)
                            .price(0.0)
                            .pricingGroupValues(
                                Rate.PricingGroupValues.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .quantity(0.0)
                            .addTier(Tier.builder().price(0.0).size(0.0).build())
                            .useListPrices(true)
                            .build()
                    )
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .commitRate(
                        ContractRateCardRetrieveRateScheduleResponse.Data.CommitRate.builder()
                            .rateType(
                                ContractRateCardRetrieveRateScheduleResponse.Data.CommitRate
                                    .RateType
                                    .FLAT
                            )
                            .price(0.0)
                            .addTier(Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pricingGroupValues(
                        ContractRateCardRetrieveRateScheduleResponse.Data.PricingGroupValues
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(contractRateCardRetrieveRateScheduleResponse.nextPage()).contains("next_page")
    }
}
