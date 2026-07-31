// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceAddChargeParamsTest {

    @Test
    fun create() {
        InvoiceAddChargeParams.builder()
            .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
            .chargeId("5ae4b726-1ebe-439c-9190-9831760ba195")
            .customerPlanId("a23b3cf4-47fb-4c3f-bb3d-9e64f7704015")
            .description("One time charge")
            .invoiceStartTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
            .price(250.0)
            .quantity(1.0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceAddChargeParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .chargeId("5ae4b726-1ebe-439c-9190-9831760ba195")
                .customerPlanId("a23b3cf4-47fb-4c3f-bb3d-9e64f7704015")
                .description("One time charge")
                .invoiceStartTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .price(250.0)
                .quantity(1.0)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InvoiceAddChargeParams.builder()
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .chargeId("5ae4b726-1ebe-439c-9190-9831760ba195")
                .customerPlanId("a23b3cf4-47fb-4c3f-bb3d-9e64f7704015")
                .description("One time charge")
                .invoiceStartTimestamp(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .price(250.0)
                .quantity(1.0)
                .build()

        val body = params._body()

        assertThat(body.chargeId()).isEqualTo("5ae4b726-1ebe-439c-9190-9831760ba195")
        assertThat(body.customerPlanId()).isEqualTo("a23b3cf4-47fb-4c3f-bb3d-9e64f7704015")
        assertThat(body.description()).isEqualTo("One time charge")
        assertThat(body.invoiceStartTimestamp())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(body.price()).isEqualTo(250.0)
        assertThat(body.quantity()).isEqualTo(1.0)
    }
}
