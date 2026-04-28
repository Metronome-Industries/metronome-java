// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.v1.contracts.namedschedules.NamedScheduleRetrieveParams
import com.metronome.api.models.v1.contracts.namedschedules.NamedScheduleUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NamedScheduleServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val namedScheduleServiceAsync = client.v1().contracts().namedSchedules()

        val namedScheduleFuture =
            namedScheduleServiceAsync.retrieve(
                NamedScheduleRetrieveParams.builder()
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .scheduleName("my-schedule")
                    .coveringDate(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                    .build()
            )

        val namedSchedule = namedScheduleFuture.get()
        namedSchedule.validate()
    }

    @Test
    fun update() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val namedScheduleServiceAsync = client.v1().contracts().namedSchedules()

        val future =
            namedScheduleServiceAsync.update(
                NamedScheduleUpdateParams.builder()
                    .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .scheduleName("my-schedule")
                    .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                    .value(JsonValue.from(mapOf("my_key" to "my_value")))
                    .endingBefore(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                    .build()
            )

        val response = future.get()
    }
}
