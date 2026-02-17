// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1InvoiceVoidResponseTest {

    @Test
    fun createV1InvoiceVoidResponse() {
        val v1InvoiceVoidResponse =
            V1InvoiceVoidResponse.builder()
                .data(
                    V1InvoiceVoidResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()
        assertThat(v1InvoiceVoidResponse).isNotNull
        assertThat(v1InvoiceVoidResponse.data())
            .contains(
                V1InvoiceVoidResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
