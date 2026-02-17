// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1CustomerPlanEndParamsTest {

    @Test
    fun create() {
        V1CustomerPlanEndParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
            .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
            .voidInvoices(true)
            .voidStripeInvoices(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CustomerPlanEndParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                .voidInvoices(true)
                .voidStripeInvoices(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
        assertThat(body.voidInvoices()).contains(true)
        assertThat(body.voidStripeInvoices()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CustomerPlanEndParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            V1CustomerPlanEndParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // path param "customerPlanId"
        assertThat(params.getPathParam(1)).isEqualTo("7aa11640-0703-4600-8eb9-293f535a6b74")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
