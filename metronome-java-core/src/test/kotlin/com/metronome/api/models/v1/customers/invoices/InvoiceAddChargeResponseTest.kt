// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceAddChargeResponseTest {

    @Test
    fun create() {
        val invoiceAddChargeResponse = InvoiceAddChargeResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceAddChargeResponse = InvoiceAddChargeResponse.builder().build()

        val roundtrippedInvoiceAddChargeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceAddChargeResponse),
                jacksonTypeRef<InvoiceAddChargeResponse>(),
            )

        assertThat(roundtrippedInvoiceAddChargeResponse).isEqualTo(invoiceAddChargeResponse)
    }
}
