// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRetrieveRateScheduleParamsTest {

    @Test
    fun create() {
        ContractRetrieveRateScheduleParams.builder()
            .limit(1L)
            .nextPage("next_page")
            .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .at(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
            .addSelector(
                ContractRetrieveRateScheduleParams.Selector.builder()
                    .partialPricingGroupValues(
                        ContractRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                            .builder()
                            .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                            .putAdditionalProperty("cloud", JsonValue.from("aws"))
                            .build()
                    )
                    .pricingGroupValues(
                        ContractRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
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
            ContractRetrieveRateScheduleParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .at(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .addSelector(
                    ContractRetrieveRateScheduleParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
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
            ContractRetrieveRateScheduleParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            ContractRetrieveRateScheduleParams.builder()
                .limit(1L)
                .nextPage("next_page")
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .at(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
                .addSelector(
                    ContractRetrieveRateScheduleParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("d6300dbb-882e-4d2d-8dec-5125d16b65d0")
                        .addProductTag("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.at()).contains(OffsetDateTime.parse("2020-01-01T00:00:00.000Z"))
        assertThat(body.selectors())
            .contains(
                listOf(
                    ContractRetrieveRateScheduleParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("region", JsonValue.from("us-west-2"))
                                .putAdditionalProperty("cloud", JsonValue.from("aws"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
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
            ContractRetrieveRateScheduleParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
