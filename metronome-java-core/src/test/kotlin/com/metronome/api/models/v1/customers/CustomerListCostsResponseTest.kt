// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListCostsResponseTest {

    @Test
    fun create() {
        val customerListCostsResponse =
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

        assertThat(customerListCostsResponse.creditTypes())
            .isEqualTo(
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
        assertThat(customerListCostsResponse.endTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customerListCostsResponse.startTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerListCostsResponse =
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

        val roundtrippedCustomerListCostsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerListCostsResponse),
                jacksonTypeRef<CustomerListCostsResponse>(),
            )

        assertThat(roundtrippedCustomerListCostsResponse).isEqualTo(customerListCostsResponse)
    }
}
