// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
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
                                .price(0.0)
                                .addTier(Tier.builder().price(0.0).size(0.0).build())
                                .build()
                        )
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .customRate(
                            ContractRateCardRateAddResponse.Data.CustomRate.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .isProrated(true)
                        .price(0.0)
                        .pricingGroupValues(
                            ContractRateCardRateAddResponse.Data.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .quantity(0.0)
                        .addTier(Tier.builder().price(0.0).size(0.0).build())
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
                            .price(0.0)
                            .addTier(Tier.builder().price(0.0).size(0.0).build())
                            .build()
                    )
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .customRate(
                        ContractRateCardRateAddResponse.Data.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .isProrated(true)
                    .price(0.0)
                    .pricingGroupValues(
                        ContractRateCardRateAddResponse.Data.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                    .useListPrices(true)
                    .build()
            )
    }
}
