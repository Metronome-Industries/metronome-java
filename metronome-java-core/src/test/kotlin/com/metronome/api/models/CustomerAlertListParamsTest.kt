// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerAlertListParamsTest {

    @Test
    fun createCustomerAlertListParams() {
        CustomerAlertListParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .alertStatuses(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
            .nextPage("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .alertStatuses(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
                .nextPage("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("next_page", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .alertStatuses(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
                .nextPage("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.alertStatuses())
            .isEqualTo(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
