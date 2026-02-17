// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerSetIngestAliasesParamsTest {

    @Test
    fun create() {
        V1CustomerSetIngestAliasesParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .addIngestAlias("team@example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerSetIngestAliasesParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addIngestAlias("team@example.com")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.ingestAliases()).isEqualTo(listOf("team@example.com"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerSetIngestAliasesParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addIngestAlias("team@example.com")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.ingestAliases()).isEqualTo(listOf("team@example.com"))
    }

    @Test
    fun getPathParam() {
        val params =
            V1CustomerSetIngestAliasesParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .addIngestAlias("team@example.com")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
