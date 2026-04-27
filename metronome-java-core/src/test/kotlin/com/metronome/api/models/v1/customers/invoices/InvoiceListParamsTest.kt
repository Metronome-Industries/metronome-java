// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.metronome.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceListParamsTest {

    @Test
    fun create() {
        InvoiceListParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditTypeId("credit_type_id")
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .nextPage("next_page")
            .skipZeroQtyLineItems(true)
            .sort(InvoiceListParams.Sort.DATE_ASC)
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .status("status")
            .type(InvoiceListParams.Type.USAGE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceListParams.builder().customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InvoiceListParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .contractId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditTypeId("credit_type_id")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .nextPage("next_page")
                .skipZeroQtyLineItems(true)
                .sort(InvoiceListParams.Sort.DATE_ASC)
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status("status")
                .type(InvoiceListParams.Type.USAGE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("contract_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("credit_type_id", "credit_type_id")
                    .put("ending_before", "2019-12-27T18:11:19.117Z")
                    .put("limit", "1")
                    .put("next_page", "next_page")
                    .put("skip_zero_qty_line_items", "true")
                    .put("sort", "date_asc")
                    .put("starting_on", "2019-12-27T18:11:19.117Z")
                    .put("status", "status")
                    .put("type", "USAGE")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            InvoiceListParams.builder().customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
