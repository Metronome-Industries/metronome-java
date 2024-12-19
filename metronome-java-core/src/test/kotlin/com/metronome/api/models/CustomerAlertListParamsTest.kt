// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerAlertListParamsTest {

    @Test
    fun createCustomerAlertListParams() {
        CustomerAlertListParams.builder()
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .nextPage("next_page")
            .alertStatuses(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .nextPage("next_page")
                .alertStatuses(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
                .build()
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getBody() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .nextPage("next_page")
                .alertStatuses(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.alertStatuses())
            .isEqualTo(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
