// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerListCostsResponseTest {

    @Test
    fun createV1CustomerListCostsResponse() {
        val v1CustomerListCostsResponse =
            V1CustomerListCostsResponse.builder()
                .creditTypes(
                    V1CustomerListCostsResponse.CreditTypes.builder()
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
        assertThat(v1CustomerListCostsResponse).isNotNull
        assertThat(v1CustomerListCostsResponse.creditTypes())
            .isEqualTo(
                V1CustomerListCostsResponse.CreditTypes.builder()
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
        assertThat(v1CustomerListCostsResponse.endTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1CustomerListCostsResponse.startTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
