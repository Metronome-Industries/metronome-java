// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.namedschedules

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamedScheduleRetrieveParamsTest {

    @Test
    fun create() {
        NamedScheduleRetrieveParams.builder()
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .scheduleName("my-schedule")
            .coveringDate(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            NamedScheduleRetrieveParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .scheduleName("my-schedule")
                .coveringDate(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                .build()

        val body = params._body()

        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.scheduleName()).isEqualTo("my-schedule")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NamedScheduleRetrieveParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .scheduleName("my-schedule")
                .build()

        val body = params._body()

        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.scheduleName()).isEqualTo("my-schedule")
    }
}
