// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V2ContractListParamsTest {

    @Test
    fun create() {
        V2ContractListParams.builder()
            .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
            .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .includeArchived(true)
            .includeBalance(true)
            .includeLedgers(true)
            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun body() {
        val params =
            V2ContractListParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeArchived(true)
                .includeBalance(true)
                .includeLedgers(true)
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.includeArchived()).contains(true)
        assertThat(body.includeBalance()).contains(true)
        assertThat(body.includeLedgers()).contains(true)
        assertThat(body.startingAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V2ContractListParams.builder()
                .customerId("13117714-3f05-48e5-a6e9-a66093f13b4d")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("13117714-3f05-48e5-a6e9-a66093f13b4d")
    }
}
