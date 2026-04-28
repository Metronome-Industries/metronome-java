// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.alerts

import com.metronome.api.core.http.QueryParams
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AlertListParamsTest {

    @Test
    fun create() {
        AlertListParams.builder()
            .nextPage("next_page")
            .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
            .addAlertStatus(AlertListParams.AlertStatus.ENABLED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AlertListParams.builder()
                .nextPage("next_page")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .addAlertStatus(AlertListParams.AlertStatus.ENABLED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("next_page", "next_page").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AlertListParams.builder().customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            AlertListParams.builder()
                .nextPage("next_page")
                .customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1")
                .addAlertStatus(AlertListParams.AlertStatus.ENABLED)
                .build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
        assertThat(body.alertStatuses().getOrNull())
            .containsExactly(AlertListParams.AlertStatus.ENABLED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AlertListParams.builder().customerId("9b85c1c1-5238-4f2a-a409-61412905e1e1").build()

        val body = params._body()

        assertThat(body.customerId()).isEqualTo("9b85c1c1-5238-4f2a-a409-61412905e1e1")
    }
}
