// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceRetrieveParamsTest {

    @Test
    fun create() {
        InvoiceRetrieveParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
            .skipZeroQtyLineItems(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(params._pathParam(1)).isEqualTo("6a37bb88-8538-48c5-b37b-a41c836328bd")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .skipZeroQtyLineItems(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("skip_zero_qty_line_items", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InvoiceRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
