// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.namedschedules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamedScheduleListResponseTest {

    @Test
    fun create() {
        val namedScheduleListResponse =
            NamedScheduleListResponse.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scheduleName("schedule_name")
                .addSegment(
                    NamedScheduleListResponse.Segment.builder()
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .properties(
                    NamedScheduleListResponse.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(namedScheduleListResponse.contractId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(namedScheduleListResponse.scheduleName()).isEqualTo("schedule_name")
        assertThat(namedScheduleListResponse.segments())
            .containsExactly(
                NamedScheduleListResponse.Segment.builder()
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(namedScheduleListResponse.properties())
            .contains(
                NamedScheduleListResponse.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namedScheduleListResponse =
            NamedScheduleListResponse.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scheduleName("schedule_name")
                .addSegment(
                    NamedScheduleListResponse.Segment.builder()
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .properties(
                    NamedScheduleListResponse.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNamedScheduleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namedScheduleListResponse),
                jacksonTypeRef<NamedScheduleListResponse>(),
            )

        assertThat(roundtrippedNamedScheduleListResponse).isEqualTo(namedScheduleListResponse)
    }
}
