// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OverrideTest {

    @Test
    fun createOverride() {
        val override =
            Override.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .applicableProductTags(listOf("string"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entitled(true)
                .multiplier(42.23)
                .overrideSpecifiers(
                    listOf(
                        Override.OverrideSpecifier.builder()
                            .presentationGroupValues(
                                Override.OverrideSpecifier.PresentationGroupValues.builder().build()
                            )
                            .pricingGroupValues(
                                Override.OverrideSpecifier.PricingGroupValues.builder().build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .productTags(listOf("string"))
                            .build()
                    )
                )
                .overwriteRate(
                    Override.OverwriteRate.builder()
                        .rateType(Override.OverwriteRate.RateType.FLAT)
                        .customRate(Override.OverwriteRate.CustomRate.builder().build())
                        .isProrated(true)
                        .price(42.23)
                        .quantity(42.23)
                        .tiers(
                            listOf(
                                Override.OverwriteRate.Tier.builder()
                                    .price(42.23)
                                    .size(42.23)
                                    .build()
                            )
                        )
                        .build()
                )
                .product(
                    Override.Product.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("string")
                        .build()
                )
                .type(Override.Type.OVERWRITE)
                .build()
        assertThat(override).isNotNull
        assertThat(override.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(override.startingAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(override.applicableProductTags().get()).containsExactly("string")
        assertThat(override.endingBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(override.entitled()).contains(true)
        assertThat(override.multiplier()).contains(42.23)
        assertThat(override.overrideSpecifiers().get())
            .containsExactly(
                Override.OverrideSpecifier.builder()
                    .presentationGroupValues(
                        Override.OverrideSpecifier.PresentationGroupValues.builder().build()
                    )
                    .pricingGroupValues(
                        Override.OverrideSpecifier.PricingGroupValues.builder().build()
                    )
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .productTags(listOf("string"))
                    .build()
            )
        assertThat(override.overwriteRate())
            .contains(
                Override.OverwriteRate.builder()
                    .rateType(Override.OverwriteRate.RateType.FLAT)
                    .customRate(Override.OverwriteRate.CustomRate.builder().build())
                    .isProrated(true)
                    .price(42.23)
                    .quantity(42.23)
                    .tiers(
                        listOf(
                            Override.OverwriteRate.Tier.builder().price(42.23).size(42.23).build()
                        )
                    )
                    .build()
            )
        assertThat(override.product())
            .contains(
                Override.Product.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .build()
            )
        assertThat(override.type()).contains(Override.Type.OVERWRITE)
    }
}
