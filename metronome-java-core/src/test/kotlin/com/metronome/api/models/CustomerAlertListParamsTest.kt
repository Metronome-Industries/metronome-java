// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerAlertListParamsTest {

    @Test
    fun create() {
        CustomerAlertListParams.builder()
            .nextPage("next_page")
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .addAlertStatus(CustomerAlertListParams.AlertStatus.ENABLED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerAlertListParams.builder()
                .nextPage("next_page")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .addAlertStatus(CustomerAlertListParams.AlertStatus.ENABLED)
                .build()
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            CustomerAlertListParams.builder()
                .nextPage("next_page")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .addAlertStatus(CustomerAlertListParams.AlertStatus.ENABLED)
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.alertStatuses())
            .contains(listOf(CustomerAlertListParams.AlertStatus.ENABLED))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomerAlertListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
