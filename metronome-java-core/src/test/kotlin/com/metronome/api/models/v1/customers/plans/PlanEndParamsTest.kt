// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.plans

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanEndParamsTest {

    @Test
    fun create() {
        PlanEndParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
            .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
            .voidInvoices(true)
            .voidStripeInvoices(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanEndParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        assertThat(params._pathParam(1)).isEqualTo("7aa11640-0703-4600-8eb9-293f535a6b74")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanEndParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .endingBefore(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
                .voidInvoices(true)
                .voidStripeInvoices(true)
                .build()

        val body = params._body()

        assertThat(body.endingBefore()).contains(OffsetDateTime.parse("2021-02-01T00:00:00Z"))
        assertThat(body.voidInvoices()).contains(true)
        assertThat(body.voidStripeInvoices()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanEndParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .customerPlanId("7aa11640-0703-4600-8eb9-293f535a6b74")
                .build()

        val body = params._body()
    }
}
