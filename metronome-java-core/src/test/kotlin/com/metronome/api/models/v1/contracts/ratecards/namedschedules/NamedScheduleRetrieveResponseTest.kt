// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.namedschedules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamedScheduleRetrieveResponseTest {

    @Test
    fun create() {
        val namedScheduleRetrieveResponse =
            NamedScheduleRetrieveResponse.builder()
                .addData(
                    NamedScheduleRetrieveResponse.Data.builder()
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(namedScheduleRetrieveResponse.data())
            .containsExactly(
                NamedScheduleRetrieveResponse.Data.builder()
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namedScheduleRetrieveResponse =
            NamedScheduleRetrieveResponse.builder()
                .addData(
                    NamedScheduleRetrieveResponse.Data.builder()
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedNamedScheduleRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namedScheduleRetrieveResponse),
                jacksonTypeRef<NamedScheduleRetrieveResponse>(),
            )

        assertThat(roundtrippedNamedScheduleRetrieveResponse)
            .isEqualTo(namedScheduleRetrieveResponse)
    }
}
