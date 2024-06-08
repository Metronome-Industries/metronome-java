// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerInvoiceListParamsTest {

    @Test
    fun createCustomerInvoiceListParams() {
        CustomerInvoiceListParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditTypeId("string")
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(100L)
            .nextPage("string")
            .skipZeroQtyLineItems(true)
            .sort(CustomerInvoiceListParams.Sort.DATE_ASC)
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .status("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerInvoiceListParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditTypeId("string")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(100L)
                .nextPage("string")
                .skipZeroQtyLineItems(true)
                .sort(CustomerInvoiceListParams.Sort.DATE_ASC)
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("credit_type_id", listOf("string"))
        expected.put("ending_before", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("string"))
        expected.put("skip_zero_qty_line_items", listOf("true"))
        expected.put("sort", listOf(CustomerInvoiceListParams.Sort.DATE_ASC.toString()))
        expected.put("starting_on", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("status", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerInvoiceListParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerInvoiceListParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
