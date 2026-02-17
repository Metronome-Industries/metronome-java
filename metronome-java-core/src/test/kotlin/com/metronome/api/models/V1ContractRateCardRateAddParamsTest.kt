// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardRateAddParamsTest {

    @Test
    fun create() {
        V1ContractRateCardRateAddParams.builder()
            .entitled(true)
            .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .rateType(V1ContractRateCardRateAddParams.RateType.FLAT)
            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
            .billingFrequency(V1ContractRateCardRateAddParams.BillingFrequency.MONTHLY)
            .commitRate(
                CommitRate.builder()
                    .rateType(CommitRate.RateType.FLAT)
                    .price(0.0)
                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
            .customRate(
                V1ContractRateCardRateAddParams.CustomRate.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .isProrated(true)
            .price(100.0)
            .pricingGroupValues(
                V1ContractRateCardRateAddParams.PricingGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .quantity(0.0)
            .addTier(Tier.builder().price(0.0).size(0.0).build())
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ContractRateCardRateAddParams.builder()
                .entitled(true)
                .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .rateType(V1ContractRateCardRateAddParams.RateType.FLAT)
                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .billingFrequency(V1ContractRateCardRateAddParams.BillingFrequency.MONTHLY)
                .commitRate(
                    CommitRate.builder()
                        .rateType(CommitRate.RateType.FLAT)
                        .price(0.0)
                        .addTier(Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                .customRate(
                    V1ContractRateCardRateAddParams.CustomRate.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isProrated(true)
                .price(100.0)
                .pricingGroupValues(
                    V1ContractRateCardRateAddParams.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .quantity(0.0)
                .addTier(Tier.builder().price(0.0).size(0.0).build())
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.entitled()).isEqualTo(true)
        assertThat(body.productId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.rateType()).isEqualTo(V1ContractRateCardRateAddParams.RateType.FLAT)
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
        assertThat(body.billingFrequency())
            .contains(V1ContractRateCardRateAddParams.BillingFrequency.MONTHLY)
        assertThat(body.commitRate())
            .contains(
                CommitRate.builder()
                    .rateType(CommitRate.RateType.FLAT)
                    .price(0.0)
                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
        assertThat(body.creditTypeId()).contains("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
        assertThat(body.customRate())
            .contains(
                V1ContractRateCardRateAddParams.CustomRate.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.isProrated()).contains(true)
        assertThat(body.price()).contains(100.0)
        assertThat(body.pricingGroupValues())
            .contains(
                V1ContractRateCardRateAddParams.PricingGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.quantity()).contains(0.0)
        assertThat(body.tiers()).contains(listOf(Tier.builder().price(0.0).size(0.0).build()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ContractRateCardRateAddParams.builder()
                .entitled(true)
                .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .rateType(V1ContractRateCardRateAddParams.RateType.FLAT)
                .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.entitled()).isEqualTo(true)
        assertThat(body.productId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.rateType()).isEqualTo(V1ContractRateCardRateAddParams.RateType.FLAT)
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
    }
}
