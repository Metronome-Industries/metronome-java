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
                .price(0.0)
                .pricingGroupValues(Rate.PricingGroupValues.builder().build())
                .quantity(0.0)
                .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
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
        assertThat(rate.price()).contains(0.0)
        assertThat(rate.pricingGroupValues()).contains(Rate.PricingGroupValues.builder().build())
        assertThat(rate.quantity()).contains(0.0)
        assertThat(rate.tiers().get()).containsExactly(Tier.builder().price(0.0).size(0.0).build())
        assertThat(rate.useListPrices()).contains(true)
    }
}
