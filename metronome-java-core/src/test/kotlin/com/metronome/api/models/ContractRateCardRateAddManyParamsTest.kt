// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRateAddManyParamsTest {

    @Test
    fun createContractRateCardRateAddManyParams() {
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
                                    ContractRateCardRateAddManyParams.Rate.CommitRate.RateType.FLAT
                                )
                                .price(0.0)
                                .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                                .build()
                        )
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .customRate(
                            ContractRateCardRateAddManyParams.Rate.CustomRate.builder().build()
                        )
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isProrated(true)
                        .price(0.0)
                        .pricingGroupValues(
                            ContractRateCardRateAddManyParams.Rate.PricingGroupValues.builder()
                                .build()
                        )
                        .quantity(0.0)
                        .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                        .useListPrices(true)
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
                                        ContractRateCardRateAddManyParams.Rate.CommitRate.RateType
                                            .FLAT
                                    )
                                    .price(0.0)
                                    .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                                    .build()
                            )
                            .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                            .customRate(
                                ContractRateCardRateAddManyParams.Rate.CustomRate.builder().build()
                            )
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .isProrated(true)
                            .price(0.0)
                            .pricingGroupValues(
                                ContractRateCardRateAddManyParams.Rate.PricingGroupValues.builder()
                                    .build()
                            )
                            .quantity(0.0)
                            .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                            .useListPrices(true)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rates())
            .isEqualTo(
                listOf(
                    ContractRateCardRateAddManyParams.Rate.builder()
                        .entitled(true)
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .rateType(ContractRateCardRateAddManyParams.Rate.RateType.FLAT)
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .commitRate(
                            ContractRateCardRateAddManyParams.Rate.CommitRate.builder()
                                .rateType(
                                    ContractRateCardRateAddManyParams.Rate.CommitRate.RateType.FLAT
                                )
                                .price(0.0)
                                .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                                .build()
                        )
                        .creditTypeId("2714e483-4ff1-48e4-9e25-ac732e8f24f2")
                        .customRate(
                            ContractRateCardRateAddManyParams.Rate.CustomRate.builder().build()
                        )
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isProrated(true)
                        .price(0.0)
                        .pricingGroupValues(
                            ContractRateCardRateAddManyParams.Rate.PricingGroupValues.builder()
                                .build()
                        )
                        .quantity(0.0)
                        .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                        .useListPrices(true)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardRateAddManyParams.builder()
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .rates(
                    listOf(
                        ContractRateCardRateAddManyParams.Rate.builder()
                            .entitled(true)
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .rateType(ContractRateCardRateAddManyParams.Rate.RateType.FLAT)
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.rates())
            .isEqualTo(
                listOf(
                    ContractRateCardRateAddManyParams.Rate.builder()
                        .entitled(true)
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .rateType(ContractRateCardRateAddManyParams.Rate.RateType.FLAT)
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
    }
}
