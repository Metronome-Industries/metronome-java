// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
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
                .addApplicableProductTag("string")
                .creditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .entitled(true)
                .isCommitSpecific(true)
                .isProrated(true)
                .multiplier(0.0)
                .addOverrideSpecifier(
                    Override.OverrideSpecifier.builder()
                        .billingFrequency(Override.OverrideSpecifier.BillingFrequency.MONTHLY)
                        .addCommitId("string")
                        .presentationGroupValues(
                            Override.OverrideSpecifier.PresentationGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            Override.OverrideSpecifier.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addProductTag("string")
                        .addRecurringCommitId("string")
                        .addRecurringCreditId("string")
                        .build()
                )
                .addOverrideTier(OverrideTier.builder().multiplier(0.0).size(0.0).build())
                .overwriteRate(
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
                )
                .price(0.0)
                .priority(0.0)
                .product(
                    Override.Product.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .quantity(0.0)
                .rateType(Override.RateType.FLAT)
                .target(Override.Target.COMMIT_RATE)
                .addTier(Tier.builder().price(0.0).size(0.0).build())
                .type(Override.Type.OVERWRITE)
                .value(
                    Override.Value.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()
        assertThat(override).isNotNull
        assertThat(override.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(override.startingAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(override.applicableProductTags().get()).containsExactly("string")
        assertThat(override.creditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(override.endingBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(override.entitled()).contains(true)
        assertThat(override.isCommitSpecific()).contains(true)
        assertThat(override.isProrated()).contains(true)
        assertThat(override.multiplier()).contains(0.0)
        assertThat(override.overrideSpecifiers().get())
            .containsExactly(
                Override.OverrideSpecifier.builder()
                    .billingFrequency(Override.OverrideSpecifier.BillingFrequency.MONTHLY)
                    .addCommitId("string")
                    .presentationGroupValues(
                        Override.OverrideSpecifier.PresentationGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .pricingGroupValues(
                        Override.OverrideSpecifier.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addProductTag("string")
                    .addRecurringCommitId("string")
                    .addRecurringCreditId("string")
                    .build()
            )
        assertThat(override.overrideTiers().get())
            .containsExactly(OverrideTier.builder().multiplier(0.0).size(0.0).build())
        assertThat(override.overwriteRate())
            .contains(
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
            )
        assertThat(override.price()).contains(0.0)
        assertThat(override.priority()).contains(0.0)
        assertThat(override.product())
            .contains(
                Override.Product.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(override.quantity()).contains(0.0)
        assertThat(override.rateType()).contains(Override.RateType.FLAT)
        assertThat(override.target()).contains(Override.Target.COMMIT_RATE)
        assertThat(override.tiers().get())
            .containsExactly(Tier.builder().price(0.0).size(0.0).build())
        assertThat(override.type()).contains(Override.Type.OVERWRITE)
        assertThat(override.value())
            .contains(
                Override.Value.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
    }
}
