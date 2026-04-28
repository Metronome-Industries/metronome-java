// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CommitRate
import com.metronome.api.models.CreditTypeData
import com.metronome.api.models.Rate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardRetrieveRateScheduleResponseTest {

    @Test
    fun create() {
        val rateCardRetrieveRateScheduleResponse =
            RateCardRetrieveRateScheduleResponse.builder()
                .addData(
                    RateCardRetrieveRateScheduleResponse.Data.builder()
                        .entitled(true)
                        .productCustomFields(
                            RateCardRetrieveRateScheduleResponse.Data.ProductCustomFields.builder()
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
                                .addTier(Rate.Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingFrequency(
                            RateCardRetrieveRateScheduleResponse.Data.BillingFrequency.MONTHLY
                        )
                        .commitRate(
                            CommitRate.builder()
                                .rateType(CommitRate.RateType.FLAT)
                                .price(0.0)
                                .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pricingGroupValues(
                            RateCardRetrieveRateScheduleResponse.Data.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(rateCardRetrieveRateScheduleResponse.data())
            .containsExactly(
                RateCardRetrieveRateScheduleResponse.Data.builder()
                    .entitled(true)
                    .productCustomFields(
                        RateCardRetrieveRateScheduleResponse.Data.ProductCustomFields.builder()
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
                            .addTier(Rate.Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .billingFrequency(
                        RateCardRetrieveRateScheduleResponse.Data.BillingFrequency.MONTHLY
                    )
                    .commitRate(
                        CommitRate.builder()
                            .rateType(CommitRate.RateType.FLAT)
                            .price(0.0)
                            .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pricingGroupValues(
                        RateCardRetrieveRateScheduleResponse.Data.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        assertThat(rateCardRetrieveRateScheduleResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateCardRetrieveRateScheduleResponse =
            RateCardRetrieveRateScheduleResponse.builder()
                .addData(
                    RateCardRetrieveRateScheduleResponse.Data.builder()
                        .entitled(true)
                        .productCustomFields(
                            RateCardRetrieveRateScheduleResponse.Data.ProductCustomFields.builder()
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
                                .addTier(Rate.Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .billingFrequency(
                            RateCardRetrieveRateScheduleResponse.Data.BillingFrequency.MONTHLY
                        )
                        .commitRate(
                            CommitRate.builder()
                                .rateType(CommitRate.RateType.FLAT)
                                .price(0.0)
                                .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pricingGroupValues(
                            RateCardRetrieveRateScheduleResponse.Data.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedRateCardRetrieveRateScheduleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateCardRetrieveRateScheduleResponse),
                jacksonTypeRef<RateCardRetrieveRateScheduleResponse>(),
            )

        assertThat(roundtrippedRateCardRetrieveRateScheduleResponse)
            .isEqualTo(rateCardRetrieveRateScheduleResponse)
    }
}
