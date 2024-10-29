// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RateTest {

    @Test
    fun createRate() {
        val rate =
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
        assertThat(rate).isNotNull
        assertThat(rate.rateType()).isEqualTo(Rate.RateType.FLAT)
        assertThat(rate.creditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(rate.customRate()).contains(Rate.CustomRate.builder().build())
        assertThat(rate.isProrated()).contains(true)
        assertThat(rate.price()).contains(42.23)
        assertThat(rate.pricingGroupValues()).contains(Rate.PricingGroupValues.builder().build())
        assertThat(rate.quantity()).contains(42.23)
        assertThat(rate.tiers().get())
            .containsExactly(Tier.builder().price(42.23).size(42.23).build())
        assertThat(rate.useListPrices()).contains(true)
    }
}
