// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts.rateCards

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import com.metronome.api.models.ContractRateCardRateListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RateServiceTest {

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateService = client.contracts().rateCards().rates()
        val response =
            rateService.list(
                ContractRateCardRateListParams.builder()
                    .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callAdd() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateService = client.contracts().rateCards().rates()
        val contractRateCardRateAddResponse =
            rateService.add(
                ContractRateCardRateAddParams.builder()
                    .entitled(true)
                    .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rateType(ContractRateCardRateAddParams.RateType.FLAT)
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .commitRate(
                        ContractRateCardRateAddParams.CommitRate.builder()
                            .rateType(ContractRateCardRateAddParams.CommitRate.RateType.FLAT)
                            .price(42.23)
                            .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                            .build()
                    )
                    .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                    .customRate(ContractRateCardRateAddParams.CustomRate.builder().build())
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isProrated(true)
                    .price(42.23)
                    .pricingGroupValues(
                        ContractRateCardRateAddParams.PricingGroupValues.builder().build()
                    )
                    .quantity(42.23)
                    .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                    .useListPrices(true)
                    .build()
            )
        println(contractRateCardRateAddResponse)
        contractRateCardRateAddResponse.validate()
    }

    @Test
    fun callAddMany() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val rateService = client.contracts().rateCards().rates()
        val contractRateCardRateAddManyResponse =
            rateService.addMany(
                ContractRateCardRateAddManyParams.builder()
                    .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .rates(
                        listOf(
                            ContractRateCardRateAddManyParams.Rate.builder()
                                .entitled(true)
                                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .rateType(ContractRateCardRateAddManyParams.Rate.RateType.FLAT)
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .commitRate(
                                    ContractRateCardRateAddManyParams.Rate.CommitRate.builder()
                                        .rateType(
                                            ContractRateCardRateAddManyParams.Rate.CommitRate
                                                .RateType
                                                .FLAT
                                        )
                                        .price(42.23)
                                        .tiers(
                                            listOf(Tier.builder().price(42.23).size(42.23).build())
                                        )
                                        .build()
                                )
                                .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                                .customRate(
                                    ContractRateCardRateAddManyParams.Rate.CustomRate.builder()
                                        .build()
                                )
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isProrated(true)
                                .price(42.23)
                                .pricingGroupValues(
                                    ContractRateCardRateAddManyParams.Rate.PricingGroupValues
                                        .builder()
                                        .build()
                                )
                                .quantity(42.23)
                                .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                                .useListPrices(true)
                                .build()
                        )
                    )
                    .build()
            )
        println(contractRateCardRateAddManyResponse)
        contractRateCardRateAddManyResponse.validate()
    }
}
