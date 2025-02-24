// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerNamedScheduleUpdateParamsTest {

    @Test
    fun create() {
        CustomerNamedScheduleUpdateParams.builder()
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .scheduleName("my-schedule")
            .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
            .value(JsonValue.from(mapOf("my_key" to "my_value")))
            .endingBefore(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomerNamedScheduleUpdateParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .scheduleName("my-schedule")
                .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .value(JsonValue.from(mapOf("my_key" to "my_value")))
                .endingBefore(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.scheduleName()).isEqualTo("my-schedule")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
        assertThat(body._value()).isEqualTo(JsonValue.from(mapOf("my_key" to "my_value")))
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2022-02-15T00:00:00Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerNamedScheduleUpdateParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .scheduleName("my-schedule")
                .startingAt(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
                .value(JsonValue.from(mapOf("my_key" to "my_value")))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.scheduleName()).isEqualTo("my-schedule")
        assertThat(body.startingAt()).isEqualTo(OffsetDateTime.parse("2022-02-01T00:00:00Z"))
        assertThat(body._value()).isEqualTo(JsonValue.from(mapOf("my_key" to "my_value")))
    }
}
