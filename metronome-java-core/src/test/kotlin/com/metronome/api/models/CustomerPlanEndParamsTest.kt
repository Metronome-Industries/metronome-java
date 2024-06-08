// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerPlanEndParamsTest {

    @Test
    fun createCustomerPlanEndParams() {
        CustomerPlanEndParams.builder()
            .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .voidInvoices(true)
            .voidStripeInvoices(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CustomerPlanEndParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .voidInvoices(true)
                .voidStripeInvoices(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.endingBefore()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.voidInvoices()).isEqualTo(true)
        assertThat(body.voidStripeInvoices()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CustomerPlanEndParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            CustomerPlanEndParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customerPlanId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "customerId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // path param "customerPlanId"
        assertThat(params.getPathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
