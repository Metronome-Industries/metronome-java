// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceRegenerateResponseTest {

    @Test
    fun createInvoiceRegenerateResponse() {
        val invoiceRegenerateResponse =
            InvoiceRegenerateResponse.builder()
                .data(
                    InvoiceRegenerateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()
        assertThat(invoiceRegenerateResponse).isNotNull
        assertThat(invoiceRegenerateResponse.data())
            .contains(
                InvoiceRegenerateResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
