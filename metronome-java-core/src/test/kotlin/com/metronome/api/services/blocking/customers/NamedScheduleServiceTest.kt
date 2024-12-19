// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.customers

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CustomerNamedScheduleRetrieveParams
import com.metronome.api.models.CustomerNamedScheduleUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class NamedScheduleServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val namedScheduleService = client.customers().namedSchedules()
        val customerNamedScheduleRetrieveResponse =
            namedScheduleService.retrieve(
                CustomerNamedScheduleRetrieveParams.builder()
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .scheduleName("my-schedule")
                    .coveringDate(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                    .build()
            )
        println(customerNamedScheduleRetrieveResponse)
        customerNamedScheduleRetrieveResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val namedScheduleService = client.customers().namedSchedules()
        namedScheduleService.update(
            CustomerNamedScheduleUpdateParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .scheduleName("my-schedule")
                .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .value(JsonValue.from(mapOf("my_key" to "my_value")))
                .endingBefore(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                .build()
        )
    }
}
