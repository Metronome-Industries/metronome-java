// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRateCardNamedScheduleRetrieveResponseTest {

    @Test
    fun createV1ContractRateCardNamedScheduleRetrieveResponse() {
        val v1ContractRateCardNamedScheduleRetrieveResponse =
            V1ContractRateCardNamedScheduleRetrieveResponse.builder()
                .addData(
                    V1ContractRateCardNamedScheduleRetrieveResponse.Data.builder()
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        assertThat(v1ContractRateCardNamedScheduleRetrieveResponse).isNotNull
        assertThat(v1ContractRateCardNamedScheduleRetrieveResponse.data())
            .containsExactly(
                V1ContractRateCardNamedScheduleRetrieveResponse.Data.builder()
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
