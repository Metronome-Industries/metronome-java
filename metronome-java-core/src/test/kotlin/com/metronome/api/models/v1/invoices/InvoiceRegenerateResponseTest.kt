// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.invoices

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceRegenerateResponseTest {

    @Test
    fun create() {
        val invoiceRegenerateResponse =
            InvoiceRegenerateResponse.builder()
                .data(
                    InvoiceRegenerateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        assertThat(invoiceRegenerateResponse.data())
            .contains(
                InvoiceRegenerateResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceRegenerateResponse =
            InvoiceRegenerateResponse.builder()
                .data(
                    InvoiceRegenerateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val roundtrippedInvoiceRegenerateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceRegenerateResponse),
                jacksonTypeRef<InvoiceRegenerateResponse>(),
            )

        assertThat(roundtrippedInvoiceRegenerateResponse).isEqualTo(invoiceRegenerateResponse)
    }
}
