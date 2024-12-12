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
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .scheduleName("schedule_name")
                    .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scheduleName("schedule_name")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(JsonValue.from(mapOf<String, Any>()))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        )
    }
}
