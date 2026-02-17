// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerInvoiceRetrieveParamsTest {

    @Test
    fun create() {
        V1CustomerInvoiceRetrieveParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
            .skipZeroQtyLineItems(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1CustomerInvoiceRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .skipZeroQtyLineItems(true)
                .build()
        val expected = QueryParams.builder()
        expected.put("skip_zero_qty_line_items", "true")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            V1CustomerInvoiceRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            V1CustomerInvoiceRetrieveParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .invoiceId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // path param "invoiceId"
        assertThat(params.getPathParam(1)).isEqualTo("6a37bb88-8538-48c5-b37b-a41c836328bd")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
