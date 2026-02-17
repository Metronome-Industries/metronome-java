// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1UsageSearchParamsTest {

    @Test
    fun create() {
        V1UsageSearchParams.builder().addTransactionId("2021-01-01T00:00:00Z_cluster42").build()
    }

    @Test
    fun body() {
        val params =
            V1UsageSearchParams.builder().addTransactionId("2021-01-01T00:00:00Z_cluster42").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.transactionIds()).isEqualTo(listOf("2021-01-01T00:00:00Z_cluster42"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1UsageSearchParams.builder().addTransactionId("2021-01-01T00:00:00Z_cluster42").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.transactionIds()).isEqualTo(listOf("2021-01-01T00:00:00Z_cluster42"))
    }
}
