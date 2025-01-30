// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BillableMetricListParamsTest {

    @Test
    fun createBillableMetricListParams() {
        BillableMetricListParams.builder()
            .includeArchived(true)
            .limit(1L)
            .nextPage("next_page")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BillableMetricListParams.builder()
                .includeArchived(true)
                .limit(1L)
                .nextPage("next_page")
                .build()
        val expected = QueryParams.builder()
        expected.put("include_archived", "true")
        expected.put("limit", "1")
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BillableMetricListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
