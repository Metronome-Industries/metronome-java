// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerSetIngestAliasesParamsTest {

    @Test
    fun createCustomerSetIngestAliasesParams() {
        CustomerSetIngestAliasesParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .ingestAliases(listOf("team@example.com"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerSetIngestAliasesParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .ingestAliases(listOf("team@example.com"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ingestAliases()).isEqualTo(listOf("team@example.com"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerSetIngestAliasesParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .ingestAliases(listOf("team@example.com"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ingestAliases()).isEqualTo(listOf("team@example.com"))
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerSetIngestAliasesParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .ingestAliases(listOf("team@example.com"))
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
