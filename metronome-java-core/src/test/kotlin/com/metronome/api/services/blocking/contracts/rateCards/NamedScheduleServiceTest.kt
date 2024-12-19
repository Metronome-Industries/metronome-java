// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.contracts.rateCards

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.ContractRateCardNamedScheduleRetrieveParams
import com.metronome.api.models.ContractRateCardNamedScheduleUpdateParams
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
        val namedScheduleService = client.contracts().rateCards().namedSchedules()
        val contractRateCardNamedScheduleRetrieveResponse =
            namedScheduleService.retrieve(
                ContractRateCardNamedScheduleRetrieveParams.builder()
                    .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                    .scheduleName("my-schedule")
                    .coveringDate(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                    .build()
            )
        println(contractRateCardNamedScheduleRetrieveResponse)
        contractRateCardNamedScheduleRetrieveResponse.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val namedScheduleService = client.contracts().rateCards().namedSchedules()
        namedScheduleService.update(
            ContractRateCardNamedScheduleUpdateParams.builder()
                .contractId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .scheduleName("my-schedule")
                .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .value(JsonValue.from(mapOf("my_key" to "my_value")))
                .endingBefore(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                .build()
        )
    }
}
