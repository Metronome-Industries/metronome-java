// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.v1.customers.namedschedules.NamedScheduleRetrieveParams
import com.metronome.api.models.v1.customers.namedschedules.NamedScheduleUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NamedScheduleServiceTest {

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val namedScheduleService = client.v1().customers().namedSchedules()

        val namedSchedule =
            namedScheduleService.retrieve(
                NamedScheduleRetrieveParams.builder()
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .scheduleName("my-schedule")
                    .coveringDate(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                    .build()
            )

        namedSchedule.validate()
    }

    @Test
    fun update() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val namedScheduleService = client.v1().customers().namedSchedules()

        namedScheduleService.update(
            NamedScheduleUpdateParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .scheduleName("my-schedule")
                .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .value(JsonValue.from(mapOf("my_key" to "my_value")))
                .endingBefore(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                .build()
        )
    }
}
