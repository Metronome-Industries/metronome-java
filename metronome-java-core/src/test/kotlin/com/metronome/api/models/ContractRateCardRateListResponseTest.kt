// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRateListResponseTest {

    @Test
    fun createContractRateCardRateListResponse() {
        val contractRateCardRateListResponse =
            ContractRateCardRateListResponse.builder()
                .entitled(true)
                .productCustomFields(
                    ContractRateCardRateListResponse.ProductCustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .productName("product_name")
                .productTags(listOf("string"))
                .rate(
                    Rate.builder()
                        .rateType(Rate.RateType.FLAT)
                        .creditType(
                            CreditTypeData.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .customRate(
                            Rate.CustomRate.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .isProrated(true)
                        .price(0.0)
                        .pricingGroupValues(
                            Rate.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .quantity(0.0)
                        .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                        .useListPrices(true)
                        .build()
                )
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .commitRate(
                    ContractRateCardRateListResponse.CommitRate.builder()
                        .rateType(ContractRateCardRateListResponse.CommitRate.RateType.FLAT)
                        .price(0.0)
                        .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                        .build()
                )
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pricingGroupValues(
                    ContractRateCardRateListResponse.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        assertThat(contractRateCardRateListResponse).isNotNull
        assertThat(contractRateCardRateListResponse.entitled()).isEqualTo(true)
        assertThat(contractRateCardRateListResponse.productCustomFields())
            .isEqualTo(
                ContractRateCardRateListResponse.ProductCustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(contractRateCardRateListResponse.productId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(contractRateCardRateListResponse.productName()).isEqualTo("product_name")
        assertThat(contractRateCardRateListResponse.productTags()).containsExactly("string")
        assertThat(contractRateCardRateListResponse.rate())
            .isEqualTo(
                Rate.builder()
                    .rateType(Rate.RateType.FLAT)
                    .creditType(
                        CreditTypeData.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .customRate(
                        Rate.CustomRate.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .isProrated(true)
                    .price(0.0)
                    .pricingGroupValues(
                        Rate.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .quantity(0.0)
                    .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                    .useListPrices(true)
                    .build()
            )
        assertThat(contractRateCardRateListResponse.startingAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contractRateCardRateListResponse.commitRate())
            .contains(
                ContractRateCardRateListResponse.CommitRate.builder()
                    .rateType(ContractRateCardRateListResponse.CommitRate.RateType.FLAT)
                    .price(0.0)
                    .tiers(listOf(Tier.builder().price(0.0).size(0.0).build()))
                    .build()
            )
        assertThat(contractRateCardRateListResponse.endingBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contractRateCardRateListResponse.pricingGroupValues())
            .contains(
                ContractRateCardRateListResponse.PricingGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
