// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardRateAddResponseTest {

    @Test
    fun createV1ContractRateCardRateAddResponse() {
        val v1ContractRateCardRateAddResponse =
            V1ContractRateCardRateAddResponse.builder()
                .data(
                    V1ContractRateCardRateAddResponse.Data.builder()
                        .rateType(V1ContractRateCardRateAddResponse.Data.RateType.FLAT)
                        .commitRate(
                            CommitRate.builder()
                                .rateType(CommitRate.RateType.FLAT)
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
                            V1ContractRateCardRateAddResponse.Data.CustomRate.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .isProrated(true)
                        .price(0.0)
                        .pricingGroupValues(
                            V1ContractRateCardRateAddResponse.Data.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .quantity(0.0)
                        .addTier(Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .build()
        assertThat(v1ContractRateCardRateAddResponse).isNotNull
        assertThat(v1ContractRateCardRateAddResponse.data())
            .isEqualTo(
                V1ContractRateCardRateAddResponse.Data.builder()
                    .rateType(V1ContractRateCardRateAddResponse.Data.RateType.FLAT)
                    .commitRate(
                        CommitRate.builder()
                            .rateType(CommitRate.RateType.FLAT)
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
                        V1ContractRateCardRateAddResponse.Data.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .isProrated(true)
                    .price(0.0)
                    .pricingGroupValues(
                        V1ContractRateCardRateAddResponse.Data.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .quantity(0.0)
                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
    }
}
