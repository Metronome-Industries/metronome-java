// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRetrieveRateScheduleParamsTest {

    @Test
    fun createContractRetrieveRateScheduleParams() {
        ContractRetrieveRateScheduleParams.builder()
            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .selectors(
                listOf(
                    ContractRetrieveRateScheduleParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .productTags(listOf("string"))
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
            ContractRetrieveRateScheduleParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .selectors(
                    listOf(
                        ContractRetrieveRateScheduleParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRetrieveRateScheduleParams.Selector.PricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .productTags(listOf("string"))
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
            ContractRetrieveRateScheduleParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            ContractRetrieveRateScheduleParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .selectors(
                    listOf(
                        ContractRetrieveRateScheduleParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRetrieveRateScheduleParams.Selector
                                    .PartialPricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRetrieveRateScheduleParams.Selector.PricingGroupValues
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .productTags(listOf("string"))
                            .build()
                    )
                )
                .limit(1L)
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.selectors())
            .isEqualTo(
                listOf(
                    ContractRetrieveRateScheduleParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PartialPricingGroupValues
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRetrieveRateScheduleParams.Selector.PricingGroupValues.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .productTags(listOf("string"))
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRetrieveRateScheduleParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
