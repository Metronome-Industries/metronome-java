// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerSetIngestAliasesParamsTest {

    @Test
    fun createCustomerSetIngestAliasesParams() {
        CustomerSetIngestAliasesParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ingestAliases(listOf("x"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerSetIngestAliasesParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ingestAliases(listOf("x"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ingestAliases()).isEqualTo(listOf("x"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerSetIngestAliasesParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ingestAliases(listOf("x"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ingestAliases()).isEqualTo(listOf("x"))
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerSetIngestAliasesParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ingestAliases(listOf("x"))
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
