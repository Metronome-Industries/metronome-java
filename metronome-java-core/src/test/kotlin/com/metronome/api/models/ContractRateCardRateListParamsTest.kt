// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRateListParamsTest {

    @Test
    fun createContractRateCardRateListParams() {
        ContractRateCardRateListParams.builder()
            .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
            .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
            .limit(1L)
            .nextPage("next_page")
            .selectors(
                listOf(
                    ContractRateCardRateListParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .productTags(listOf("string"))
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .limit(1L)
                .nextPage("next_page")
                .selectors(
                    listOf(
                        ContractRateCardRateListParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                            .productTags(listOf("string"))
                            .build()
                    )
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .limit(1L)
                .nextPage("next_page")
                .selectors(
                    listOf(
                        ContractRateCardRateListParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                    .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                            .productTags(listOf("string"))
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
        assertThat(body.rateCardId()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
        assertThat(body.selectors())
            .isEqualTo(
                listOf(
                    ContractRateCardRateListParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .productTags(listOf("string"))
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
        assertThat(body.rateCardId()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
    }
}
