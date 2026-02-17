// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OverwriteRateTest {

    @Test
    fun createOverwriteRate() {
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
                .addTier(Tier.builder().price(0.0).size(0.0).build())
                .build()
        assertThat(overwriteRate).isNotNull
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
        assertThat(overwriteRate.tiers().get())
            .containsExactly(Tier.builder().price(0.0).size(0.0).build())
    }
}
