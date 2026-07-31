// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RateCardRetrieveRateScheduleParamsTest {

    @Test
    fun create() {
        RateCardRetrieveRateScheduleParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
            .startingAt(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addSelector(
                RateCardRetrieveRateScheduleParams.Selector.builder()
                    .billingFrequency(
                        RateCardRetrieveRateScheduleParams.Selector.BillingFrequency.MONTHLY
                    )
                    .partialPricingGroupValues(
                        RateCardRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                            .builder()
                            .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .pricingGroupValues(
                        RateCardRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RateCardRetrieveRateScheduleParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .startingAt(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSelector(
                    RateCardRetrieveRateScheduleParams.Selector.builder()
                        .billingFrequency(
                            RateCardRetrieveRateScheduleParams.Selector.BillingFrequency.MONTHLY
                        )
                        .partialPricingGroupValues(
                            RateCardRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            RateCardRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
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
            RateCardRetrieveRateScheduleParams.builder()
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .startingAt(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RateCardRetrieveRateScheduleParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .startingAt(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSelector(
                    RateCardRetrieveRateScheduleParams.Selector.builder()
                        .billingFrequency(
                            RateCardRetrieveRateScheduleParams.Selector.BillingFrequency.MONTHLY
                        )
                        .partialPricingGroupValues(
                            RateCardRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            RateCardRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.rateCardId()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.selectors().getOrNull())
            .containsExactly(
                RateCardRetrieveRateScheduleParams.Selector.builder()
                    .billingFrequency(
                        RateCardRetrieveRateScheduleParams.Selector.BillingFrequency.MONTHLY
                    )
                    .partialPricingGroupValues(
                        RateCardRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                            .builder()
                            .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .pricingGroupValues(
                        RateCardRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RateCardRetrieveRateScheduleParams.builder()
                .rateCardId("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
                .startingAt(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
                .build()

        val body = params._body()

        assertThat(body.rateCardId()).isEqualTo("f3d51ae8-f283-44e1-9933-a3cf9ad7a6fe")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00.000Z"))
    }
}
