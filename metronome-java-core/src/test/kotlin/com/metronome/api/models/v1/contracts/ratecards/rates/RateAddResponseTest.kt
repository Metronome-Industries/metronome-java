// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.rates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.CommitRate
import com.metronome.api.models.CreditTypeData
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateAddResponseTest {

    @Test
    fun create() {
        val rateAddResponse =
            RateAddResponse.builder()
                .data(
                    RateAddResponse.Data.builder()
                        .rateType(RateAddResponse.Data.RateType.FLAT)
                        .commitRate(
                            CommitRate.builder()
                                .rateType(CommitRate.RateType.FLAT)
                                .price(0.0)
                                .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .customRate(
                            RateAddResponse.Data.CustomRate.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .isProrated(true)
                        .price(0.0)
                        .pricingGroupValues(
                            RateAddResponse.Data.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .quantity(0.0)
                        .addTier(RateAddResponse.Data.Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .build()

        assertThat(rateAddResponse.data())
            .isEqualTo(
                RateAddResponse.Data.builder()
                    .rateType(RateAddResponse.Data.RateType.FLAT)
                    .commitRate(
                        CommitRate.builder()
                            .rateType(CommitRate.RateType.FLAT)
                            .price(0.0)
                            .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .customRate(
                        RateAddResponse.Data.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .isProrated(true)
                    .price(0.0)
                    .pricingGroupValues(
                        RateAddResponse.Data.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(RateAddResponse.Data.Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rateAddResponse =
            RateAddResponse.builder()
                .data(
                    RateAddResponse.Data.builder()
                        .rateType(RateAddResponse.Data.RateType.FLAT)
                        .commitRate(
                            CommitRate.builder()
                                .rateType(CommitRate.RateType.FLAT)
                                .price(0.0)
                                .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .customRate(
                            RateAddResponse.Data.CustomRate.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .isProrated(true)
                        .price(0.0)
                        .pricingGroupValues(
                            RateAddResponse.Data.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .quantity(0.0)
                        .addTier(RateAddResponse.Data.Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .build()

        val roundtrippedRateAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rateAddResponse),
                jacksonTypeRef<RateAddResponse>(),
            )

        assertThat(roundtrippedRateAddResponse).isEqualTo(rateAddResponse)
    }
}
