// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListCostsPageResponseTest {

    @Test
    fun create() {
        val customerListCostsPageResponse =
            CustomerListCostsPageResponse.builder()
                .addData(
                    CustomerListCostsResponse.builder()
                        .creditTypes(
                            CustomerListCostsResponse.CreditTypes.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "cost" to 0,
                                            "line_item_breakdown" to
                                                listOf(
                                                    mapOf(
                                                        "cost" to 0,
                                                        "name" to "name",
                                                        "group_key" to "group_key",
                                                        "group_value" to "group_value",
                                                    )
                                                ),
                                            "name" to "name",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPage("next_page")
                .build()

        assertThat(customerListCostsPageResponse.data())
            .containsExactly(
                CustomerListCostsResponse.builder()
                    .creditTypes(
                        CustomerListCostsResponse.CreditTypes.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "cost" to 0,
                                        "line_item_breakdown" to
                                            listOf(
                                                mapOf(
                                                    "cost" to 0,
                                                    "name" to "name",
                                                    "group_key" to "group_key",
                                                    "group_value" to "group_value",
                                                )
                                            ),
                                        "name" to "name",
                                    )
                                ),
                            )
                            .build()
                    )
                    .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(customerListCostsPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListCostsPageResponse =
            CustomerListCostsPageResponse.builder()
                .addData(
                    CustomerListCostsResponse.builder()
                        .creditTypes(
                            CustomerListCostsResponse.CreditTypes.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "cost" to 0,
                                            "line_item_breakdown" to
                                                listOf(
                                                    mapOf(
                                                        "cost" to 0,
                                                        "name" to "name",
                                                        "group_key" to "group_key",
                                                        "group_value" to "group_value",
                                                    )
                                                ),
                                            "name" to "name",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .endTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .nextPage("next_page")
                .build()

        val roundtrippedCustomerListCostsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListCostsPageResponse),
                jacksonTypeRef<CustomerListCostsPageResponse>(),
            )

        assertThat(roundtrippedCustomerListCostsPageResponse)
            .isEqualTo(customerListCostsPageResponse)
    }
}
