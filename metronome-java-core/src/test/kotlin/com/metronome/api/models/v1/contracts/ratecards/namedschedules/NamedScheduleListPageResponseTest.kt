// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.ratecards.namedschedules

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamedScheduleListPageResponseTest {

    @Test
    fun create() {
        val namedScheduleListPageResponse =
            NamedScheduleListPageResponse.builder()
                .addData(
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
                )
                .nextPage("next_page")
                .build()

        assertThat(namedScheduleListPageResponse.data())
            .containsExactly(
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
            )
        assertThat(namedScheduleListPageResponse.nextPage()).contains("next_page")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val namedScheduleListPageResponse =
            NamedScheduleListPageResponse.builder()
                .addData(
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
                )
                .nextPage("next_page")
                .build()

        val roundtrippedNamedScheduleListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(namedScheduleListPageResponse),
                jacksonTypeRef<NamedScheduleListPageResponse>(),
            )

        assertThat(roundtrippedNamedScheduleListPageResponse)
            .isEqualTo(namedScheduleListPageResponse)
    }
}
