// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.rates

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateListParamsTest {

    @Test
    fun create() {
        RateListParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
            .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
            .addSelector(
                RateListParams.Selector.builder()
                    .billingFrequency(RateListParams.Selector.BillingFrequency.MONTHLY)
                    .partialPricingGroupValues(
                        RateListParams.Selector.PartialPricingGroupValues.builder()
                            .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .pricingGroupValues(
                        RateListParams.Selector.PricingGroupValues.builder()
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
            RateListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .addSelector(
                    RateListParams.Selector.builder()
                        .billingFrequency(RateListParams.Selector.BillingFrequency.MONTHLY)
                        .partialPricingGroupValues(
                            RateListParams.Selector.PartialPricingGroupValues.builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            RateListParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .addProductTag("string")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("limit", "1").put("next_page", "next_page").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RateListParams.builder()
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RateListParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .addSelector(
                    RateListParams.Selector.builder()
                        .billingFrequency(RateListParams.Selector.BillingFrequency.MONTHLY)
                        .partialPricingGroupValues(
                            RateListParams.Selector.PartialPricingGroupValues.builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            RateListParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .addProductTag("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
        assertThat(body.rateCardId()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
        assertThat(body.selectors().getOrNull())
            .containsExactly(
                RateListParams.Selector.builder()
                    .billingFrequency(RateListParams.Selector.BillingFrequency.MONTHLY)
                    .partialPricingGroupValues(
                        RateListParams.Selector.PartialPricingGroupValues.builder()
                            .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .pricingGroupValues(
                        RateListParams.Selector.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                    .addProductTag("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RateListParams.builder()
                .at(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .build()

        val body = params._body()

        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
        assertThat(body.rateCardId()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
    }
}
