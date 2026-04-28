// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListBillableMetricsParamsTest {

    @Test
    fun create() {
        CustomerListBillableMetricsParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .includeArchived(true)
            .limit(1L)
            .nextPage("next_page")
            .onCurrentPlan(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerListBillableMetricsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerListBillableMetricsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .includeArchived(true)
                .limit(1L)
                .nextPage("next_page")
                .onCurrentPlan(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("include_archived", "true")
                    .put("limit", "1")
                    .put("next_page", "next_page")
                    .put("on_current_plan", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerListBillableMetricsParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
