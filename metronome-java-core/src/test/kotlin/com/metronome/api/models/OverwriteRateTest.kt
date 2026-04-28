// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OverwriteRateTest {

    @Test
    fun create() {
        val overwriteRate =
            OverwriteRate.builder()
                .rateType(OverwriteRate.RateType.FLAT)
                .creditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .customRate(
                    OverwriteRate.CustomRate.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .isProrated(true)
                .price(0.0)
                .quantity(0.0)
                .addTier(OverwriteRate.Tier.builder().price(0.0).size(0.0).build())
                .build()

        assertThat(overwriteRate.rateType()).isEqualTo(OverwriteRate.RateType.FLAT)
        assertThat(overwriteRate.creditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(overwriteRate.customRate())
            .contains(
                OverwriteRate.CustomRate.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(overwriteRate.isProrated()).contains(true)
        assertThat(overwriteRate.price()).contains(0.0)
        assertThat(overwriteRate.quantity()).contains(0.0)
        assertThat(overwriteRate.tiers().getOrNull())
            .containsExactly(OverwriteRate.Tier.builder().price(0.0).size(0.0).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val overwriteRate =
            OverwriteRate.builder()
                .rateType(OverwriteRate.RateType.FLAT)
                .creditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .customRate(
                    OverwriteRate.CustomRate.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .isProrated(true)
                .price(0.0)
                .quantity(0.0)
                .addTier(OverwriteRate.Tier.builder().price(0.0).size(0.0).build())
                .build()

        val roundtrippedOverwriteRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(overwriteRate),
                jacksonTypeRef<OverwriteRate>(),
            )

        assertThat(roundtrippedOverwriteRate).isEqualTo(overwriteRate)
    }
}
