// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardRateListResponseTest {

    @Test
    fun createV1ContractRateCardRateListResponse() {
        val v1ContractRateCardRateListResponse =
            V1ContractRateCardRateListResponse.builder()
                .entitled(true)
                .productCustomFields(
                    V1ContractRateCardRateListResponse.ProductCustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .productName("product_name")
                .addProductTag("string")
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
                        .addTier(Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .billingFrequency(V1ContractRateCardRateListResponse.BillingFrequency.MONTHLY)
                .commitRate(
                    CommitRate.builder()
                        .rateType(CommitRate.RateType.FLAT)
                        .price(0.0)
                        .addTier(Tier.builder().price(0.0).size(0.0).build())
                        .build()
                )
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pricingGroupValues(
                    V1ContractRateCardRateListResponse.PricingGroupValues.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()
        assertThat(v1ContractRateCardRateListResponse).isNotNull
        assertThat(v1ContractRateCardRateListResponse.entitled()).isEqualTo(true)
        assertThat(v1ContractRateCardRateListResponse.productCustomFields())
            .isEqualTo(
                V1ContractRateCardRateListResponse.ProductCustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(v1ContractRateCardRateListResponse.productId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(v1ContractRateCardRateListResponse.productName()).isEqualTo("product_name")
        assertThat(v1ContractRateCardRateListResponse.productTags()).containsExactly("string")
        assertThat(v1ContractRateCardRateListResponse.rate())
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
                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
        assertThat(v1ContractRateCardRateListResponse.startingAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1ContractRateCardRateListResponse.billingFrequency())
            .contains(V1ContractRateCardRateListResponse.BillingFrequency.MONTHLY)
        assertThat(v1ContractRateCardRateListResponse.commitRate())
            .contains(
                CommitRate.builder()
                    .rateType(CommitRate.RateType.FLAT)
                    .price(0.0)
                    .addTier(Tier.builder().price(0.0).size(0.0).build())
                    .build()
            )
        assertThat(v1ContractRateCardRateListResponse.endingBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1ContractRateCardRateListResponse.pricingGroupValues())
            .contains(
                V1ContractRateCardRateListResponse.PricingGroupValues.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }
}
