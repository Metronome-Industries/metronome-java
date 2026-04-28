// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceRetrievePdfParamsTest {

    @Test
    fun create() {
        InvoiceRetrievePdfParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceRetrievePdfParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(params._pathParam(1)).isEqualTo("6a37bb88-8538-48c5-b37b-a41c836328bd")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
