// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageSearchParamsTest {

    @Test
    fun create() {
        UsageSearchParams.builder().addTransactionId("2021-01-01T00:00:00Z_cluster42").build()
    }

    @Test
    fun body() {
        val params =
            UsageSearchParams.builder().addTransactionId("2021-01-01T00:00:00Z_cluster42").build()

        val body = params._body()

        assertThat(body.transactionIds()).containsExactly("2021-01-01T00:00:00Z_cluster42")
    }
}
