// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractNamedScheduleRetrieveParamsTest {

    @Test
    fun createContractNamedScheduleRetrieveParams() {
        ContractNamedScheduleRetrieveParams.builder()
            .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .scheduleName("my-schedule")
            .coveringDate(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractNamedScheduleRetrieveParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .scheduleName("my-schedule")
                .coveringDate(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.scheduleName()).isEqualTo("my-schedule")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractNamedScheduleRetrieveParams.builder()
                .rateCardId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .scheduleName("my-schedule")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.rateCardId()).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(body.scheduleName()).isEqualTo("my-schedule")
    }
}
