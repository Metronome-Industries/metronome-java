// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRetrieveRateScheduleParamsTest {

    @Test
    fun createContractRateCardRetrieveRateScheduleParams() {
        ContractRateCardRetrieveRateScheduleParams.builder()
            .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .selectors(
                listOf(
                    ContractRateCardRetrieveRateScheduleParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRateCardRetrieveRateScheduleParams.Selector
                                .PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRateCardRetrieveRateScheduleParams.Selector.PricingGroupValues
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ContractRateCardRetrieveRateScheduleParams.builder()
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .selectors(
                    listOf(
                        ContractRateCardRetrieveRateScheduleParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRateCardRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRateCardRetrieveRateScheduleParams.Selector
                                    .PricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .limit(1L)
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ContractRateCardRetrieveRateScheduleParams.builder()
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            ContractRateCardRetrieveRateScheduleParams.builder()
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .selectors(
                    listOf(
                        ContractRateCardRetrieveRateScheduleParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRateCardRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRateCardRetrieveRateScheduleParams.Selector
                                    .PricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .limit(1L)
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.selectors())
            .isEqualTo(
                listOf(
                    ContractRateCardRetrieveRateScheduleParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRateCardRetrieveRateScheduleParams.Selector
                                .PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRateCardRetrieveRateScheduleParams.Selector.PricingGroupValues
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardRetrieveRateScheduleParams.builder()
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
