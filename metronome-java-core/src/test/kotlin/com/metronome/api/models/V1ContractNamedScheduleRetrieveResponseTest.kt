// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractNamedScheduleRetrieveResponseTest {

    @Test
    fun createV1ContractNamedScheduleRetrieveResponse() {
        val v1ContractNamedScheduleRetrieveResponse =
            V1ContractNamedScheduleRetrieveResponse.builder()
                .addData(
                    V1ContractNamedScheduleRetrieveResponse.Data.builder()
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        assertThat(v1ContractNamedScheduleRetrieveResponse).isNotNull
        assertThat(v1ContractNamedScheduleRetrieveResponse.data())
            .containsExactly(
                V1ContractNamedScheduleRetrieveResponse.Data.builder()
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
