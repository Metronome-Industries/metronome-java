// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerInvoiceAddChargeParamsTest {

    @Test
    fun createCustomerInvoiceAddChargeParams() {
        CustomerInvoiceAddChargeParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .invoiceStartTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .price(0.0)
            .quantity(0.0)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerInvoiceAddChargeParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .invoiceStartTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .price(0.0)
                .quantity(0.0)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.chargeId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerPlanId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.invoiceStartTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.price()).isEqualTo(0.0)
        assertThat(body.quantity()).isEqualTo(0.0)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerInvoiceAddChargeParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .invoiceStartTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .price(0.0)
                .quantity(0.0)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.chargeId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.customerPlanId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.invoiceStartTimestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.price()).isEqualTo(0.0)
        assertThat(body.quantity()).isEqualTo(0.0)
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerInvoiceAddChargeParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .invoiceStartTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .price(0.0)
                .quantity(0.0)
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
