// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardRateListParamsTest {

    @Test
    fun createContractRateCardRateListParams() {
        ContractRateCardRateListParams.builder()
            .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .selectors(
                listOf(
                    ContractRateCardRateListParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                .builder()
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                .build()
                        )
                        .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .productTags(listOf("string"))
                        .build()
                )
            )
            .limit(100L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .selectors(
                    listOf(
                        ContractRateCardRateListParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                    .builder()
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .productTags(listOf("string"))
                            .build()
                    )
                )
                .limit(100L)
                .nextPage("next_page")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("next_page"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .selectors(
                    listOf(
                        ContractRateCardRateListParams.Selector.builder()
                            .partialPricingGroupValues(
                                ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                    .builder()
                                    .build()
                            )
                            .pricingGroupValues(
                                ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
                                    .build()
                            )
                            .productId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .productTags(listOf("string"))
                            .build()
                    )
                )
                .limit(100L)
                .nextPage("next_page")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.selectors())
            .isEqualTo(
                listOf(
                    ContractRateCardRateListParams.Selector.builder()
                        .partialPricingGroupValues(
                            ContractRateCardRateListParams.Selector.PartialPricingGroupValues
                                .builder()
                                .build()
                        )
                        .pricingGroupValues(
                            ContractRateCardRateListParams.Selector.PricingGroupValues.builder()
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
            ContractRateCardRateListParams.builder()
                .at(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .rateCardId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.at()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.rateCardId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
