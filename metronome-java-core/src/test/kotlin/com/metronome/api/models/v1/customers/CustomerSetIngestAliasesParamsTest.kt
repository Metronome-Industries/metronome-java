// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerSetIngestAliasesParamsTest {

    @Test
    fun create() {
        CustomerSetIngestAliasesParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .addIngestAlias("team@example.com")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerSetIngestAliasesParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addIngestAlias("team@example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomerSetIngestAliasesParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addIngestAlias("team@example.com")
                .build()

        val body = params._body()

        assertThat(body.ingestAliases()).containsExactly("team@example.com")
    }
}
