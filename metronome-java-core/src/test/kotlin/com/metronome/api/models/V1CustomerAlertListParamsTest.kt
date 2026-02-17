// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.core.http.QueryParams
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerAlertListParamsTest {

    @Test
    fun create() {
        V1CustomerAlertListParams.builder()
            .nextPage("next_page")
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .addAlertStatus(V1CustomerAlertListParams.AlertStatus.ENABLED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1CustomerAlertListParams.builder()
                .nextPage("next_page")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .addAlertStatus(V1CustomerAlertListParams.AlertStatus.ENABLED)
                .build()
        val expected = QueryParams.builder()
        expected.put("next_page", "next_page")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            V1CustomerAlertListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun body() {
        val params =
            V1CustomerAlertListParams.builder()
                .nextPage("next_page")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .addAlertStatus(V1CustomerAlertListParams.AlertStatus.ENABLED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.alertStatuses())
            .contains(listOf(V1CustomerAlertListParams.AlertStatus.ENABLED))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerAlertListParams.builder()
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
