// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerInvoiceListParamsTest {

    @Test
    fun createCustomerInvoiceListParams() {
        CustomerInvoiceListParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .creditTypeId("credit_type_id")
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .nextPage("next_page")
            .skipZeroQtyLineItems(true)
            .sort(CustomerInvoiceListParams.Sort.DATE_ASC)
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerInvoiceListParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .creditTypeId("credit_type_id")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .nextPage("next_page")
                .skipZeroQtyLineItems(true)
                .sort(CustomerInvoiceListParams.Sort.DATE_ASC)
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status("status")
                .build()
        val expected = QueryParams.builder()
        expected.put("credit_type_id", "credit_type_id")
        expected.put("ending_before", "2019-12-27T18:11:19.117Z")
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        expected.put("skip_zero_qty_line_items", "true")
        expected.put("sort", CustomerInvoiceListParams.Sort.DATE_ASC.toString())
        expected.put("starting_on", "2019-12-27T18:11:19.117Z")
        expected.put("status", "status")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerInvoiceListParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerInvoiceListParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
