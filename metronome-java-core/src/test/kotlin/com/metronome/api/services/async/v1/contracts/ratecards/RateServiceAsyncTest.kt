// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts.ratecards

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CommitRate
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddManyParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateAddParams
import com.metronome.api.models.v1.contracts.ratecards.rates.RateListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RateServiceAsyncTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateServiceAsync = client.v1().contracts().rateCards().rates()

        val pageFuture =
            rateServiceAsync.list(
                RateListParams.builder()
                    .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                    .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun add() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateServiceAsync = client.v1().contracts().rateCards().rates()

        val responseFuture =
            rateServiceAsync.add(
                RateAddParams.builder()
                    .entitled(true)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .rateType(RateAddParams.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .billingFrequency(RateAddParams.BillingFrequency.MONTHLY)
                    .commitRate(
                        CommitRate.builder()
                            .rateType(CommitRate.RateType.FLAT)
                            .price(0.0)
                            .addTier(CommitRate.Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customRate(
                        RateAddParams.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isProrated(true)
                    .price(100.0)
                    .pricingGroupValues(
                        RateAddParams.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(RateAddParams.Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun addMany() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateServiceAsync = client.v1().contracts().rateCards().rates()

        val responseFuture =
            rateServiceAsync.addMany(
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
                            .addTier(
                                RateAddManyParams.Rate.Tier.builder().price(0.0).size(0.0).build()
                            )
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
                            .addTier(
                                RateAddManyParams.Rate.Tier.builder().price(0.0).size(0.0).build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
