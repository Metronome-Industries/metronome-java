// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.invoices

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceVoidResponseTest {

    @Test
    fun create() {
        val invoiceVoidResponse =
            InvoiceVoidResponse.builder()
                .data(
                    InvoiceVoidResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(invoiceVoidResponse.data())
            .contains(
                InvoiceVoidResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceVoidResponse =
            InvoiceVoidResponse.builder()
                .data(
                    InvoiceVoidResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedInvoiceVoidResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceVoidResponse),
                jacksonTypeRef<InvoiceVoidResponse>(),
            )

        assertThat(roundtrippedInvoiceVoidResponse).isEqualTo(invoiceVoidResponse)
    }
}
