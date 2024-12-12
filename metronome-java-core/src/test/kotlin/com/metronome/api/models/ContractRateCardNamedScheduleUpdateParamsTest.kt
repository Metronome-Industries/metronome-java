// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractRateCardNamedScheduleUpdateParamsTest {

    @Test
    fun createContractRateCardNamedScheduleUpdateParams() {
        ContractRateCardNamedScheduleUpdateParams.builder()
            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .scheduleName("schedule_name")
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .value(JsonValue.from(mapOf<String, Any>()))
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ContractRateCardNamedScheduleUpdateParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scheduleName("schedule_name")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(JsonValue.from(mapOf<String, Any>()))
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.scheduleName()).isEqualTo("schedule_name")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.value()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ContractRateCardNamedScheduleUpdateParams.builder()
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .scheduleName("schedule_name")
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(JsonValue.from(mapOf<String, Any>()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contractId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.scheduleName()).isEqualTo("schedule_name")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.value()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
