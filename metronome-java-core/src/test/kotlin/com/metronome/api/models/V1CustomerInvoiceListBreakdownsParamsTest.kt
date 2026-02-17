// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerInvoiceListBreakdownsParamsTest {

    @Test
    fun create() {
        V1CustomerInvoiceListBreakdownsParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .creditTypeId("credit_type_id")
            .limit(1L)
            .nextPage("next_page")
            .skipZeroQtyLineItems(true)
            .sort(V1CustomerInvoiceListBreakdownsParams.Sort.DATE_ASC)
            .status("status")
            .windowSize(V1CustomerInvoiceListBreakdownsParams.WindowSize.HOUR)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1CustomerInvoiceListBreakdownsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditTypeId("credit_type_id")
                .limit(1L)
                .nextPage("next_page")
                .skipZeroQtyLineItems(true)
                .sort(V1CustomerInvoiceListBreakdownsParams.Sort.DATE_ASC)
                .status("status")
                .windowSize(V1CustomerInvoiceListBreakdownsParams.WindowSize.HOUR)
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "2019-12-27T18:11:19.117Z")
        expected.put("starting_on", "2019-12-27T18:11:19.117Z")
        expected.put("credit_type_id", "credit_type_id")
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        expected.put("skip_zero_qty_line_items", "true")
        expected.put("sort", V1CustomerInvoiceListBreakdownsParams.Sort.DATE_ASC.toString())
        expected.put("status", "status")
        expected.put(
            "window_size",
            V1CustomerInvoiceListBreakdownsParams.WindowSize.HOUR.toString(),
        )
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            V1CustomerInvoiceListBreakdownsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = QueryParams.builder()
        expected.put("ending_before", "2019-12-27T18:11:19.117Z")
        expected.put("starting_on", "2019-12-27T18:11:19.117Z")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            V1CustomerInvoiceListBreakdownsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
