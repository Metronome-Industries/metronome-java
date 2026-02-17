// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardRateListParamsTest {

    @Test
    fun create() {
        V1ContractRateCardRateListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
            .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
            .addSelector(
                V1ContractRateCardRateListParams.Selector.builder()
                    .billingFrequency(
                        V1ContractRateCardRateListParams.Selector.BillingFrequency.MONTHLY
                    )
                    .partialPricingGroupValues(
                        V1ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                            .builder()
                            .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .pricingGroupValues(
                        V1ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                    .addProductTag("string")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1ContractRateCardRateListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .addSelector(
                    V1ContractRateCardRateListParams.Selector.builder()
                        .billingFrequency(
                            V1ContractRateCardRateListParams.Selector.BillingFrequency.MONTHLY
                        )
                        .partialPricingGroupValues(
                            V1ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            V1ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .addProductTag("string")
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            V1ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            V1ContractRateCardRateListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .addSelector(
                    V1ContractRateCardRateListParams.Selector.builder()
                        .billingFrequency(
                            V1ContractRateCardRateListParams.Selector.BillingFrequency.MONTHLY
                        )
                        .partialPricingGroupValues(
                            V1ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            V1ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .addProductTag("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
        assertThat(body.rateCardId()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
        assertThat(body.selectors())
            .contains(
                listOf(
                    V1ContractRateCardRateListParams.Selector.builder()
                        .billingFrequency(
                            V1ContractRateCardRateListParams.Selector.BillingFrequency.MONTHLY
                        )
                        .partialPricingGroupValues(
                            V1ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            V1ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .addProductTag("string")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
        assertThat(body.rateCardId()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
    }
}
