// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.contracts.rateCards

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.ContractRateCardRateAddManyParams
import com.metronome.api.models.ContractRateCardRateAddParams
import com.metronome.api.models.ContractRateCardRateListParams
import com.metronome.api.models.Tier
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RateServiceAsyncTest {

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateServiceAsync = client.contracts().rateCards().rates()

        val pageFuture =
            rateServiceAsync.list(
                ContractRateCardRateListParams.builder()
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
        val rateServiceAsync = client.contracts().rateCards().rates()

        val responseFuture =
            rateServiceAsync.add(
                ContractRateCardRateAddParams.builder()
                    .entitled(true)
                    .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .rateType(ContractRateCardRateAddParams.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                    .commitRate(
                        ContractRateCardRateAddParams.CommitRate.builder()
                            .rateType(ContractRateCardRateAddParams.CommitRate.RateType.FLAT)
                            .price(0.0)
                            .addTier(Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customRate(
                        ContractRateCardRateAddParams.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isProrated(true)
                    .price(100.0)
                    .pricingGroupValues(
                        ContractRateCardRateAddParams.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                    .useListPrices(true)
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
        val rateServiceAsync = client.contracts().rateCards().rates()

        val responseFuture =
            rateServiceAsync.addMany(
                ContractRateCardRateAddManyParams.builder()
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .addRate(
                        ContractRateCardRateAddManyParams.Rate.builder()
                            .entitled(true)
                            .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                            .rateType(ContractRateCardRateAddManyParams.Rate.RateType.FLAT)
                            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .commitRate(
                                ContractRateCardRateAddManyParams.Rate.CommitRate.builder()
                                    .rateType(
                                        ContractRateCardRateAddManyParams.Rate.CommitRate.RateType
                                            .FLAT
                                    )
                                    .price(0.0)
                                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                                    .build()
                            )
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .customRate(
                                ContractRateCardRateAddManyParams.Rate.CustomRate.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .isProrated(true)
                            .price(100.0)
                            .pricingGroupValues(
                                ContractRateCardRateAddManyParams.Rate.PricingGroupValues.builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .quantity(0.0)
                            .addTier(Tier.builder().price(0.0).size(0.0).build())
                            .useListPrices(true)
                            .build()
                    )
                    .addRate(
                        ContractRateCardRateAddManyParams.Rate.builder()
                            .entitled(true)
                            .productId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                            .rateType(ContractRateCardRateAddManyParams.Rate.RateType.FLAT)
                            .startingAt(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                            .commitRate(
                                ContractRateCardRateAddManyParams.Rate.CommitRate.builder()
                                    .rateType(
                                        ContractRateCardRateAddManyParams.Rate.CommitRate.RateType
                                            .FLAT
                                    )
                                    .price(0.0)
                                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                                    .build()
                            )
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .customRate(
                                ContractRateCardRateAddManyParams.Rate.CustomRate.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .isProrated(true)
                            .price(120.0)
                            .pricingGroupValues(
                                ContractRateCardRateAddManyParams.Rate.PricingGroupValues.builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-east-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .quantity(0.0)
                            .addTier(Tier.builder().price(0.0).size(0.0).build())
                            .useListPrices(true)
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
