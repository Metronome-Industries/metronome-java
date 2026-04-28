// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.rates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CommitRate
import com.metronome.api.models.CreditTypeData
import com.metronome.api.models.Rate
import com.metronome.api.models.Tier
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateListResponseTest {

    @Test
    fun create() {
        val rateListResponse =
            RateListResponse.builder()
                .entitled(true)
                .productCustomFields(
                    RateListResponse.ProductCustomFields.builder()
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
                        .build()
                )
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingFrequency(RateListResponse.BillingFrequency.MONTHLY)
                .commitRate(
                    CommitRate.builder()
                        .rateType(CommitRate.RateType.FLAT)
                        .price(0.0)
                        .addTier(Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pricingGroupValues(
                    RateListResponse.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(rateListResponse.entitled()).isEqualTo(true)
        assertThat(rateListResponse.productCustomFields())
            .isEqualTo(
                RateListResponse.ProductCustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(rateListResponse.productId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(rateListResponse.productName()).isEqualTo("product_name")
        assertThat(rateListResponse.productTags()).containsExactly("string")
        assertThat(rateListResponse.rate())
            .isEqualTo(
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
                    .build()
            )
        assertThat(rateListResponse.startingAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(rateListResponse.billingFrequency())
            .contains(RateListResponse.BillingFrequency.MONTHLY)
        assertThat(rateListResponse.commitRate())
            .contains(
                CommitRate.builder()
                    .rateType(CommitRate.RateType.FLAT)
                    .price(0.0)
                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
        assertThat(rateListResponse.endingBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(rateListResponse.pricingGroupValues())
            .contains(
                RateListResponse.PricingGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateListResponse =
            RateListResponse.builder()
                .entitled(true)
                .productCustomFields(
                    RateListResponse.ProductCustomFields.builder()
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
                        .build()
                )
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingFrequency(RateListResponse.BillingFrequency.MONTHLY)
                .commitRate(
                    CommitRate.builder()
                        .rateType(CommitRate.RateType.FLAT)
                        .price(0.0)
                        .addTier(Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pricingGroupValues(
                    RateListResponse.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedRateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateListResponse),
                jacksonTypeRef<RateListResponse>(),
            )

        assertThat(roundtrippedRateListResponse).isEqualTo(rateListResponse)
    }
}
