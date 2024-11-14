// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRateAddResponseTest {

    @Test
    fun createContractRateCardRateAddResponse() {
        val contractRateCardRateAddResponse =
            ContractRateCardRateAddResponse.builder()
                .data(
                    ContractRateCardRateAddResponse.Data.builder()
                        .rateType(ContractRateCardRateAddResponse.Data.RateType.FLAT)
                        .commitRate(
                            ContractRateCardRateAddResponse.Data.CommitRate.builder()
                                .rateType(
                                    ContractRateCardRateAddResponse.Data.CommitRate.RateType.FLAT
                                )
                                .price(42.23)
                                .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                                .build()
                        )
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .customRate(
                            ContractRateCardRateAddResponse.Data.CustomRate.builder().build()
                        )
                        .isProrated(true)
                        .price(42.23)
                        .pricingGroupValues(
                            ContractRateCardRateAddResponse.Data.PricingGroupValues.builder()
                                .build()
                        )
                        .quantity(42.23)
                        .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                        .useListPrices(true)
                        .build()
                )
                .build()
        assertThat(contractRateCardRateAddResponse).isNotNull
        assertThat(contractRateCardRateAddResponse.data())
            .isEqualTo(
                ContractRateCardRateAddResponse.Data.builder()
                    .rateType(ContractRateCardRateAddResponse.Data.RateType.FLAT)
                    .commitRate(
                        ContractRateCardRateAddResponse.Data.CommitRate.builder()
                            .rateType(ContractRateCardRateAddResponse.Data.CommitRate.RateType.FLAT)
                            .price(42.23)
                            .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                            .build()
                    )
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .customRate(ContractRateCardRateAddResponse.Data.CustomRate.builder().build())
                    .isProrated(true)
                    .price(42.23)
                    .pricingGroupValues(
                        ContractRateCardRateAddResponse.Data.PricingGroupValues.builder().build()
                    )
                    .quantity(42.23)
                    .tiers(listOf(Tier.builder().price(42.23).size(42.23).build()))
                    .useListPrices(true)
                    .build()
            )
    }
}
