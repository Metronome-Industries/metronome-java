// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.rates

import com.metronome.api.core.JsonValue
import com.metronome.api.models.CommitRate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateAddManyParamsTest {

    @Test
    fun create() {
        RateAddManyParams.builder()
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .addRate(
                RateAddManyParams.Rate.builder()
                    .entitled(true)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .rateType(RateAddManyParams.Rate.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .billingFrequency(RateAddManyParams.Rate.BillingFrequency.MONTHLY)
                    .commitRate(
                        CommitRate.builder()
                            .rateType(CommitRate.RateType.FLAT)
                            .price(0.0)
                            .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customRate(
                        RateAddManyParams.Rate.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isProrated(true)
                    .price(100.0)
                    .pricingGroupValues(
                        RateAddManyParams.Rate.PricingGroupValues.builder()
                            .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(RateAddManyParams.Rate.Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
            .addRate(
                RateAddManyParams.Rate.builder()
                    .entitled(true)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .rateType(RateAddManyParams.Rate.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .billingFrequency(RateAddManyParams.Rate.BillingFrequency.MONTHLY)
                    .commitRate(
                        CommitRate.builder()
                            .rateType(CommitRate.RateType.FLAT)
                            .price(0.0)
                            .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customRate(
                        RateAddManyParams.Rate.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isProrated(true)
                    .price(120.0)
                    .pricingGroupValues(
                        RateAddManyParams.Rate.PricingGroupValues.builder()
                            .putAdditionalProperty("region", JsonValue.from("us-east-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(RateAddManyParams.Rate.Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            RateAddManyParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addRate(
                    RateAddManyParams.Rate.builder()
                        .entitled(true)
                        .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .rateType(RateAddManyParams.Rate.RateType.FLAT)
                        .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .billingFrequency(RateAddManyParams.Rate.BillingFrequency.MONTHLY)
                        .commitRate(
                            CommitRate.builder()
                                .rateType(CommitRate.RateType.FLAT)
                                .price(0.0)
                                .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .customRate(
                            RateAddManyParams.Rate.CustomRate.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isProrated(true)
                        .price(100.0)
                        .pricingGroupValues(
                            RateAddManyParams.Rate.PricingGroupValues.builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .quantity(0.0)
                        .addTier(RateAddManyParams.Rate.Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .addRate(
                    RateAddManyParams.Rate.builder()
                        .entitled(true)
                        .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .rateType(RateAddManyParams.Rate.RateType.FLAT)
                        .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .billingFrequency(RateAddManyParams.Rate.BillingFrequency.MONTHLY)
                        .commitRate(
                            CommitRate.builder()
                                .rateType(CommitRate.RateType.FLAT)
                                .price(0.0)
                                .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .customRate(
                            RateAddManyParams.Rate.CustomRate.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isProrated(true)
                        .price(120.0)
                        .pricingGroupValues(
                            RateAddManyParams.Rate.PricingGroupValues.builder()
                                .putAdditionalProperty("region", JsonValue.from("us-east-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .quantity(0.0)
                        .addTier(RateAddManyParams.Rate.Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.rates())
            .containsExactly(
                RateAddManyParams.Rate.builder()
                    .entitled(true)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .rateType(RateAddManyParams.Rate.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .billingFrequency(RateAddManyParams.Rate.BillingFrequency.MONTHLY)
                    .commitRate(
                        CommitRate.builder()
                            .rateType(CommitRate.RateType.FLAT)
                            .price(0.0)
                            .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customRate(
                        RateAddManyParams.Rate.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isProrated(true)
                    .price(100.0)
                    .pricingGroupValues(
                        RateAddManyParams.Rate.PricingGroupValues.builder()
                            .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(RateAddManyParams.Rate.Tier.builder().price(0.0).size(0.0).build())
                    .build(),
                RateAddManyParams.Rate.builder()
                    .entitled(true)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .rateType(RateAddManyParams.Rate.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .billingFrequency(RateAddManyParams.Rate.BillingFrequency.MONTHLY)
                    .commitRate(
                        CommitRate.builder()
                            .rateType(CommitRate.RateType.FLAT)
                            .price(0.0)
                            .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customRate(
                        RateAddManyParams.Rate.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isProrated(true)
                    .price(120.0)
                    .pricingGroupValues(
                        RateAddManyParams.Rate.PricingGroupValues.builder()
                            .putAdditionalProperty("region", JsonValue.from("us-east-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(RateAddManyParams.Rate.Tier.builder().price(0.0).size(0.0).build())
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RateAddManyParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addRate(
                    RateAddManyParams.Rate.builder()
                        .entitled(true)
                        .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .rateType(RateAddManyParams.Rate.RateType.FLAT)
                        .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .build()
                )
                .addRate(
                    RateAddManyParams.Rate.builder()
                        .entitled(true)
                        .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                        .rateType(RateAddManyParams.Rate.RateType.FLAT)
                        .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.rates())
            .containsExactly(
                RateAddManyParams.Rate.builder()
                    .entitled(true)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .rateType(RateAddManyParams.Rate.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build(),
                RateAddManyParams.Rate.builder()
                    .entitled(true)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .rateType(RateAddManyParams.Rate.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .build(),
            )
    }
}
