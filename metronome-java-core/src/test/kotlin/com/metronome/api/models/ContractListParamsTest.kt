// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ContractListParamsTest {

    @Test
    fun create() {
        ContractListParams.builder()
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
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
            ContractListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .coveringDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .includeArchived(true)
                .includeBalance(true)
                .includeLedgers(true)
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.coveringDate()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.includeArchived()).contains(true)
        assertThat(body.includeBalance()).contains(true)
        assertThat(body.includeLedgers()).contains(true)
        assertThat(body.startingAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ContractListParams.builder().customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
