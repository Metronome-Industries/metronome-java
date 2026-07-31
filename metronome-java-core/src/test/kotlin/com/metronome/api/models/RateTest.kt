// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateTest {

    @Test
    fun create() {
        val rate =
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

        assertThat(rate.rateType()).isEqualTo(Rate.RateType.FLAT)
        assertThat(rate.creditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(rate.customRate())
            .contains(
                Rate.CustomRate.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(rate.isProrated()).contains(true)
        assertThat(rate.price()).contains(0.0)
        assertThat(rate.pricingGroupValues())
            .contains(
                Rate.PricingGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(rate.quantity()).contains(0.0)
        assertThat(rate.tiers().getOrNull())
            .containsExactly(Rate.Tier.builder().price(0.0).size(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rate =
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

        val roundtrippedRate =
            jsonMapper.readValue(jsonMapper.writeValueAsString(rate), jacksonTypeRef<Rate>())

        assertThat(roundtrippedRate).isEqualTo(rate)
    }
}
