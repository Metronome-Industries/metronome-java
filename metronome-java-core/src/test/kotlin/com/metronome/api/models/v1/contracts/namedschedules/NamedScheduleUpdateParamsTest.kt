// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.namedschedules

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamedScheduleUpdateParamsTest {

    @Test
    fun create() {
        NamedScheduleUpdateParams.builder()
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .scheduleName("my-schedule")
            .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .value(JsonValue.from(mapOf("my_key" to "my_value")))
            .endingBefore(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            NamedScheduleUpdateParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .scheduleName("my-schedule")
                .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .value(JsonValue.from(mapOf("my_key" to "my_value")))
                .endingBefore(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.scheduleName()).isEqualTo("my-schedule")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
        assertThat(body._value()).isEqualTo(JsonValue.from(mapOf("my_key" to "my_value")))
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NamedScheduleUpdateParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .scheduleName("my-schedule")
                .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .value(JsonValue.from(mapOf("my_key" to "my_value")))
                .build()

        val body = params._body()

        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.scheduleName()).isEqualTo("my-schedule")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
        assertThat(body._value()).isEqualTo(JsonValue.from(mapOf("my_key" to "my_value")))
    }
}
