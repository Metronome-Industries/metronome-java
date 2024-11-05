// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerListBillableMetricsParamsTest {

    @Test
    fun createCustomerListBillableMetricsParams() {
        CustomerListBillableMetricsParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeArchived(true)
            .limit(100L)
            .nextPage("next_page")
            .onCurrentPlan(true)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerListBillableMetricsParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeArchived(true)
                .limit(100L)
                .nextPage("next_page")
                .onCurrentPlan(true)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("include_archived", listOf("true"))
        expected.put("limit", listOf("100"))
        expected.put("next_page", listOf("next_page"))
        expected.put("on_current_plan", listOf("true"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerListBillableMetricsParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerListBillableMetricsParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
