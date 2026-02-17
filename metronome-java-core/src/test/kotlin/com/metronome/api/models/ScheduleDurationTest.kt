// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduleDurationTest {

    @Test
    fun create() {
        val scheduleDuration =
            ScheduleDuration.builder()
                .addScheduleItem(
                    ScheduleDuration.ScheduleItem.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0.0)
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .creditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .build()

        assertThat(scheduleDuration.scheduleItems())
            .containsExactly(
                ScheduleDuration.ScheduleItem.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0.0)
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(scheduleDuration.creditType())
            .contains(
                CreditTypeData.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduleDuration =
            ScheduleDuration.builder()
                .addScheduleItem(
                    ScheduleDuration.ScheduleItem.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0.0)
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .creditType(
                    CreditTypeData.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .build()

        val roundtrippedScheduleDuration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduleDuration),
                jacksonTypeRef<ScheduleDuration>(),
            )

        assertThat(roundtrippedScheduleDuration).isEqualTo(scheduleDuration)
    }
}
